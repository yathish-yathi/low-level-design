package org.example;

public class FurnitureFactory {
    public OldStyleChair createOldStyleChair(){
        return new OldStyleChair();
    }

    public OldStyleTable createOldStyleTable(){
        return new OldStyleTable();
    }

    public ModernStyleChair createModernStyleChair(){
        return new ModernStyleChair();
    }

    public ModernStyleTable createModernStyleTable(){
        return new ModernStyleTable();
    }
}
