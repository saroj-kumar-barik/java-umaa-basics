package org.activity.inheritance;

public class Parent {
    int var1 = 11;
    static int var2 = 200;

    public void m1() {
        System.out.println("methods inside parent, m1()");
    }

    public static void m2() {
        // static methods are inherited, but not overridden
        System.out.println("static method inside parent, m2()");
    }

}

class Child extends Parent {
    int var1 = 22;
    static int var2 = 2000;

    public void m1() {
        // m1() is overridden in child class
        System.out.println("method inside child, m1()");
    }

    public static void m2() {
        // hiding parent class static method m2()
        System.out.println("static method inside child, m2()");
    }

    public static void main(String[] args) {
        Parent p1 = new Child();
        System.out.println(p1.var1);
        p1.m1();
        Parent.m2();
        Child.m2();
        Child c1 = new Child();
        System.out.println(c1.var1);
        c1.m1();
    }
}
