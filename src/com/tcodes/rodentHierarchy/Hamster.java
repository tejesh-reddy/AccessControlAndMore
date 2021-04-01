package com.tcodes.rodentHierarchy;

public class Hamster extends Rodent{

    public Hamster()
    {
        System.out.println("Hamster");
    }

    @Override
    public void squeak()
    {
        System.out.println("Hamster squeak");
    }

    public void run()
    {
        System.out.println("Running");
    }
}
