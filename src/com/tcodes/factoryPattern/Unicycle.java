package com.tcodes.factoryPattern;

class  Unicycle implements Cycle {
    private int id;
    @Override
    public void start() {
        System.out.println("UniCycle has been started in start methods");
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