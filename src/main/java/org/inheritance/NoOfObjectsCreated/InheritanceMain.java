package org.inheritance.NoOfObjectsCreated;

public class InheritanceMain {
    // here super() is called in the first line of
    // child constructor but in both child and parent one object is created upon
    // creating object
    // so total no of objects created is : 1
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
    }
}
