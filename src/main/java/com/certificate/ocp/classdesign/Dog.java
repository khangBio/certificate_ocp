package com.certificate.ocp.classdesign;

public class Dog extends Mammal {
    protected void setNameAndAge(String dogName, int age) {
        //name = dogName;
        super.name = dogName; // Access to protected field class Mammal
        setAge(age); // Call to public method class Mammal
    }

    public void barks() {
        System.out.println("Dog: " + name + " Age: " + getAge() + " says: woof!");
    }
}
