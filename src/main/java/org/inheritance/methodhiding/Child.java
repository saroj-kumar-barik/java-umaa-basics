package org.inheritance.methodhiding;

public class Child extends Parent {
    public static void m1(){
        System.out.println("Child:m1()");
    }

    public void m2(){
        System.out.println("Child:m2()");
    }

}
