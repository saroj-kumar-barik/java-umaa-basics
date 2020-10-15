package org.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Child c1 = new Child(11);
        c1.m1(); // accessing parent behaviour using child reference var
        System.out.println(c1.i); // parent field using child reference var
        c1.m2();
        System.out.println(c1.j);

        Parent c2 = new Child(22); // child object hold by refVar of type parent
        System.out.println(c2.i);
//        System.out.println(c2.j); // not accessible
        c2.m1();

        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.m1();

    }
}
