package com.certificate.ocp.classdesign.initialize;

public class Dog extends Mamal {
    private String name = "Rex"; //todo: 5, because it's variable instance
    { System.out.println("Name: " + name); } //todo: 7

    private static int i = 0; //todo: 2
    static { System.out.println(i); } //todo: 3

    {
        i++;
        System.out.println(i);
    }//todo: 8

    public Dog() {
        System.out.println("Woof!"); //todo: 9
    }

    public static void main(String[] args) {
        System.out.println("I am the main one."); //todo: 4
        Dog dog = new Dog();
    }
}
