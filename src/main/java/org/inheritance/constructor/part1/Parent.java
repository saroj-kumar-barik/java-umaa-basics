package org.inheritance.constructor.part1;

public class Parent {
    private int i;

    public Parent(int i) {
        this.i = i;
    }
    // this is added to fix the compilation error
    // that arises due to unavailability of default constructor in parent class
    public Parent() {
        System.out.println("inside parent default constructor.");
    }
}
