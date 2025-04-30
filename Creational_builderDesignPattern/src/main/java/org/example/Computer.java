package org.example;

public class Computer {
    //mandatory fields
    private String cpu;
    private Integer ram;

    //optional fields
    private Boolean hasSsd = false;
    private Boolean hasGraphicsCard = false;

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.hasSsd = builder.hasSsd;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    public static class Builder {
        private String cpu;
        private Integer ram;

        public Builder(String cpu, int ram){
            this.cpu=cpu;
            this.ram=ram;
        }

        //optional fields
        private Boolean hasSsd = false;
        private Boolean hasGraphicsCard = false;

        public Builder hasSsd(Boolean hasSsd){
            this.hasSsd = hasSsd;
            return this;
        }

        public Builder hasGraphicsCard(Boolean hasGraphicsCard){
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }


    public void printDetails(){
        System.out.println(cpu+" : "+ram+" : "+hasSsd+" : "+hasGraphicsCard);
    }
}
