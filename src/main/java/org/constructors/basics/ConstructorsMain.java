package org.constructors.basics;

public class ConstructorsMain {

    public static void main(String[] args) {
        Constructors constructors = new Constructors();
        Constructors constructors1 = new Constructors(11,22);
        Constructors constructors2 = new Constructors(111);

        System.out.println("inside main function...");

        System.out.println("Values are : "+constructors.a+ " "+constructors.b);
        System.out.println("Values are : "+constructors1.a+ " "+constructors1.b);
        System.out.println("Values are : "+constructors2.a+ " "+constructors2.b);
    }





}
