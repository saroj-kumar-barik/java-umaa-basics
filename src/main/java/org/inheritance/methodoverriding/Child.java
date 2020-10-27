package org.inheritance.methodoverriding;

public class Child extends Parent{

    @Override
    public void m1() {
        System.out.println("child:m1()");
    }

    public void m2(){
        System.out.println("Child:m2()");
    }
}
