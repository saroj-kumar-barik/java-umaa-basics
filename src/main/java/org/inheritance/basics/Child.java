package org.inheritance.basics;

public class Child extends Parent {
    public int j ;

    public Child(int j) {
        this.j = j;
    }

    public void m2(){
        System.out.println("A method inside child m2()");
    }
}
