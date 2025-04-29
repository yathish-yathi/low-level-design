package org.example;

public class OldStyleFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(){
        return new OldStyleChair();
    }
    @Override
    public Table createTable(){
        return new OldStyleTable();
    }

}
