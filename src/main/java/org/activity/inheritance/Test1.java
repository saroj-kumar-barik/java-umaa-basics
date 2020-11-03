package org.activity.inheritance;

public  class Test1 {

    public static void main(String[] args) {
        Parent p1 = new Child();

        System.out.println(p1.var1); // parent
        p1.m1();  // child
        Parent.m2(); // parent
        Child.m2(); // child

        Child c1 = new Child();
        System.out.println(c1.var1); // child
        c1.m1(); // child
    }

    public static class Parent {
        int var1 = getVar1();
        static int var2 = getVar2();

        public void m1() {
            System.out.println("methods inside parent, m1()");
        }

        public static void m2() {
            // static methods are inherited, but not overridden
            System.out.println("static method inside parent, m2()");
        }

        public  int getVar1(){
            System.out.println("non-static variable ");
            return 100;
        }

        public static int getVar2(){
            System.out.println("non-static variable ");
            return 1000;
        }

    }

    public static class Child extends Parent {
        // variable hiding
        int var1 =  getVar2();
        static int var2 = getVar2();

        public void m1() {
            // m1() is overridden in child class
            System.out.println("method inside child, m1()");
        }

        public static void m2() {
            // hiding parent class static method m2()
            System.out.println("static method inside child, m2()");
        }

        public  int getVar1(){
            System.out.println("non-static variable ");
            return 200;
        }

        public static int getVar2(){
            System.out.println("non-static variable ");
            return 2000;
        }

    }
}
