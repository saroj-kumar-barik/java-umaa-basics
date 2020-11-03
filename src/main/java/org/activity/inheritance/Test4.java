package org.activity.inheritance;

public class Test4 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
        Child c = new Child();
        c.m1();
    }

    private static class Parent{
        private void m1(){
            System.out.println("static method : parent,m1()");
        }
    }

    private static class Child extends Parent{
        // method hiding
        public static void m1(){
            System.out.println("static method : child,m1()");
        }
    }
}
