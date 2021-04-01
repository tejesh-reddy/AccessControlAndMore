package com.tcodes.rodentHierarchy;


public class Mouse extends Rodent{

    public Mouse()
    {
        System.out.println("Mouse");
    }

    @Override
    public void squeak()
    {
        System.out.println("Mouse squeak");
    }

    public void bite()
    {
        System.out.println("Biting");
    }
}
