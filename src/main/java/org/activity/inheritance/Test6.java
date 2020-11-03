package org.activity.inheritance;

public class Test6 {
    static class A {
        public int i = 10;
        public int j = 20;

//    public int sumValue(int x) {
//        return x + this.i + this.j;
//    }

    }

    static class B extends A {
        public int i = 100;

        public int sumValue(int x) {
            return x + this.i + this.j + super.i + super.j;
        }
    }

    static class Test {
        public static void main(String[] args) {
            A a = new B();
            int result = ((B) a).sumValue(a.i);
            System.out.println(result);
        }
    }
}
