package org.activity.inheritance;

public class Test3 {
    private static void main(String[] args) {
        Parent p = new Child();
    }

    private static class Parent{
        public Parent() {
            System.out.println("constructor parent..");

        }
    }

    private static class Child extends Parent{
        public Child() {
//            super(); // this call is made automatically
            System.out.println("constructor child..");
        }
    }
}
