package com.certificate.ocp.classdesign.initialize;

public class Mamal {
    //static block initailize
    static { System.out.println("Hello!"); } //todo: 1

    static { System.out.println("Hello 22!"); }
    //non-static block initailize
    { System.out.println("Good Afternoon."); } //todo: 6
}
