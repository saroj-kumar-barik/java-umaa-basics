package org.inheritance.methodhiding;

public class InheritanceMain {
    public static void main(String[] args) {
        // method hiding is possible in case, if a method is static
        // in case of static methods, the method depends upon the type of refVariable
        // not on the object created.
        Parent p1 = new Parent();
        p1.m1(); // parent
        p1.m2(); // parent

        Parent p2 = new Child();
        p2.m1(); // parent - also called method hiding
        p2.m2(); // child

        Child c1 = new Child();
        c1.m1(); // child
        c1.m2(); // child

    }
}
