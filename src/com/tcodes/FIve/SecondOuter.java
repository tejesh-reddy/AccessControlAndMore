package com.tcodes.FIve;


public class SecondOuter {
    public class SecondInner {
        Outer outer = new Outer();
        Outer.Inner firstInner = new Outer.Inner("Okay");
    }
}
