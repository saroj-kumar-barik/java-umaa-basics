package org.inheritance.variablehiding;

public class InheritanceMain {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println("using parent obj and refVar " + p1.i); // invoke parent field

        p1 = new Child();
        System.out.println("using child obj and parent refVAr " + p1.i); // invoke parent field as refVar is of type
        // Parent

        Child c1 = new Child();
        // field/variable hiding
        System.out.println("using child obj and refVar " + c1.i); // invoke child field
    }
}
