package org.constructors;

public class Constructors {
    public int a, b;

    public Constructors() {
        System.out.println("Inside default constructor...");
        System.out.println("A =  "+this.a+" and B is = "+this.b);
        System.out.println("---------------------------------------------------");
    }

    public Constructors(int a, int b){
        System.out.println("Inside 2-param constructor...");
        System.out.println("Before using constructor A =  "+this.a+" and B is = "+this.b);
        this.a = a;
        this.b = b;
        System.out.println("After using constructor A = "+this.a+" and B is = "+this.b);
        System.out.println("---------------------------------------------------");
    }

    public Constructors(int a){
        System.out.println("Inside 1-param constructor...");
        System.out.println("Before using constructor A =  "+this.a+" and B is = "+this.b);
        this.a = a;
        System.out.println("After using constructor A = "+this.a+" and B is = "+this.b);
        System.out.println("---------------------------------------------------");
    }

}
