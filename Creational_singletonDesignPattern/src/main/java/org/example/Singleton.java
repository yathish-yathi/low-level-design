package org.example;

//Singleton Pattern in Java Thread-safe with Lazy Initialization (initialised only when first getInstance is called)
public class Singleton {
    private static Singleton singletonInstance = null;

    private Singleton(){ // constructor is private to avoid initialisation directly, there is a way to by pass private through a technic called Reflection and create instance we can further avoid it by adding one more if(instance == null ) check inside constructor
        System.out.println("creating singleton Instance");
    }

    public static Singleton getInstance(){ // static to make this method class level
        if(singletonInstance==null){  // Thread A and B may both pass
            synchronized(Singleton.class){ // Only one thread enters from here
                if(singletonInstance==null){// Double-check by entered threads to prevent second instance creation
                    singletonInstance =  new Singleton(); // Only ONE thread reaches here
                    return singletonInstance;
                }
            }
        }
        return singletonInstance;
    }

}

//Eager loading
//public class EagerSingleton {
//
//    // Step 1: Create instance eagerly at class loading time
//    private static final EagerSingleton instance = new EagerSingleton();
//
//    // Step 2: Private constructor prevents instantiation from other classes
//    private EagerSingleton() {
//        System.out.println("EagerSingleton instance created!");
//    }
//
//    // Step 3: Public method to access the instance
//    public static EagerSingleton getInstance() {
//        return instance;
//    }
//
//}
