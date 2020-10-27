package org.inheritance.constructor.part2;

public class Parent {
    private int i;
    public Parent(int i) {
        this.i = i;
        System.out.println("Value of field :"+i);
        System.out.println("inside parent");
    }
}
