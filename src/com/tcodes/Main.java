package com.tcodes;

import com.tcodes.cycles.Bicycle;
import com.tcodes.cycles.Cycle;
import com.tcodes.cycles.Tricycle;
import com.tcodes.cycles.Unicycle;
import com.tcodes.rodentHierarchy.Gerbil;
import com.tcodes.rodentHierarchy.Hamster;
import com.tcodes.rodentHierarchy.Mouse;
import com.tcodes.rodentHierarchy.Rodent;

public class Main {

    public static void main(String[] args) {
        // Rodent hierarchy
        Rodent[] rodents = new Rodent[4];


        /*
        All the below creation statements print two lines, one from Rodent astract class constructor and another
        from the various concrete classes.
         */

        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Rodent() {
            @Override
            public void squeak() {
                System.out.println("Generic rodent squeak");
            }
        };
        rodents[3] = new Hamster();

        // Cycles
        /*
        Cannot use balance() on either Cycle or Tricycle as there is no such method in those classes.
         */
        Cycle firstCycle= new Bicycle();
        Cycle secondCycle = new Unicycle();
        Cycle thirdCycle = new Tricycle();
        Bicycle first= (Bicycle)firstCycle;
        Unicycle second = (Unicycle) secondCycle;
        Tricycle third = (Tricycle) thirdCycle;
        first.balance();
        second.balance();

        //
    }

}
