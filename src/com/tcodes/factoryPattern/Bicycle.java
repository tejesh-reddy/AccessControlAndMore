package com.tcodes.factoryPattern;

public class Bicycle implements Cycle {
    private int id;
    @Override
    public void start() {
        System.out.println("Bicycle has been started in start methods");
    }
    @Override
    public void setId(int id) {
        this.id=id;
    }

    @Override
    public int getId() {
        return id;
    }
}
