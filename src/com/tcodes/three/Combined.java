package com.tcodes.three;

public class Combined extends  ConcreteX implements One, Two, Three{
    private int one;
    private int two;
    private int three;

    @Override
    public void setOne() {
        one = 1;
    }

    @Override
    public void printOne() {
        System.out.println(one);
    }

    @Override
    public void setThree() {
        three = 3;
    }

    @Override
    public void printThree() {
        System.out.println(three);
    }

    @Override
    public void setTwo() {
        two = 2;
    }

    @Override
    public void printTwo() {
        System.out.println(two);
    }
}
