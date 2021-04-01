package com.tcodes.three;

public class Main {
    public static void main(String[] args) {
        Combined combined = new Combined();

        oneMethod(combined);
        twoMethod(combined);
        threeMethod(combined);
        concreteMethod(combined);
    }

    public static void oneMethod(One one)
    {
        one.setOne();
        one.printOne();
    }

    public static void twoMethod(Two two)
    {
        two.setTwo();
        two.printTwo();
    }

    public static void threeMethod(Three three)
    {
        three.setThree();
        three.printThree();
    }

    public static void concreteMethod(ConcreteX concreteX)
    {
        concreteX.printX();
    }
}
