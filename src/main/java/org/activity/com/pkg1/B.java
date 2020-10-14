package org.activity.com.pkg1;

public class B {
    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.i); // private access so not accessible
        System.out.println(a.getI());
        System.out.println(a.j);
//        System.out.println(a.l);
        System.out.println(a.k); // why this is accessible?
    }
}
