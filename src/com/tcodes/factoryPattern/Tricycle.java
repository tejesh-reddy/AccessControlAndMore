package com.tcodes.factoryPattern;

class Tricycle implements Cycle{
    private int id;
    @Override
    public void start() {
        System.out.println("Car has been started in start method");
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