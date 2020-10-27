package org.inheritance.methodoverriding;

public class InheritanceMain {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.m1();
//        c1  = (Child) new Parent(); // classCastException
        Parent p1 = new Parent();
        p1.m1();

        p1 = new Child();
        p1.m1();
    }
}
