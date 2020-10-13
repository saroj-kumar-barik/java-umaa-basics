package org.activity.com.pkg2;
import org.activity.com.pkg1.*;
public class B {
    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.i);
        System.out.println(a.getI());
        System.out.println(a.getK());
        System.out.println(a.j);
//        System.out.println(a.k); // default modifiers not accessible
    }
}
