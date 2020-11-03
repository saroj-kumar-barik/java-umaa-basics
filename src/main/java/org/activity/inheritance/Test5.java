package org.activity.inheritance;

public class Test5 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.i); // access parent

        Child c = new Child();
        System.out.println(c.i); // access child
    }
    public static class Parent{
        public  int i= 10 ;
    }

    public static class Child extends Parent{

        // the variable "i" is hidden in child class
        public int i = 100;
    }
}


