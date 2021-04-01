package com.tcodes.factoryPattern;

public class Main {

    public static void main(String[] args) {
        CycleFactory garage = new CycleFactory();

        Cycle firstCycle = garage.getCycle("bicycle");
        firstCycle.setId(111);
        System.out.println(firstCycle.getId());
        firstCycle.start();
    }
}
