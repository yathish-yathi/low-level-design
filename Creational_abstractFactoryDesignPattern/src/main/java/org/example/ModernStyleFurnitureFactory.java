package org.example;

public class ModernStyleFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
            return new ModernStyleChair();
    }
    @Override
    public Table createTable() {
        return new ModernStyleTable();
    }
}
