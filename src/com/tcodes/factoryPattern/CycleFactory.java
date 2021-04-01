package com.tcodes.factoryPattern;

class CycleFactory {

    public Cycle getCycle(String cycleType){
        if(cycleType == null){
            return null;
        }
        if(cycleType.equalsIgnoreCase("Unicycle")){
            return new Unicycle();

        } else if(cycleType.equalsIgnoreCase("Bicycle")){
            return new Bicycle();

        } else if(cycleType.equalsIgnoreCase("Tricycle")){
            return new Tricycle();
        }

        return null;
    }
}