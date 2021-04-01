package com.tcodes.rodentHierarchy;

public class Gerbil extends Rodent{

    public Gerbil()
    {
        System.out.println("Gerbil");
    }

    @Override
    public void squeak()
    {
        System.out.println("Gerbil Squeak");
    }

    public void burrow()
    {
        System.out.println("Burrowing");
    }
}
