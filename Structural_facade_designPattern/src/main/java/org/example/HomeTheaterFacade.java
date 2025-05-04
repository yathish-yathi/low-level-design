package org.example;

public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem sound;
    private StreamingApp app;

    public HomeTheaterFacade() {
        tv = new TV();
        sound = new SoundSystem();
        app = new StreamingApp();
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        tv.on();
        sound.on();
        sound.setVolume(10);
        app.launch();
        app.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down...");
        tv.off();
    }
}

