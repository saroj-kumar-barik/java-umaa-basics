package org.inheritance.NoOfObjectsCreated;

public class Parent {
    public Parent() {
        System.out.println(this.hashCode());
        System.out.println(this.getClass());
    }
}
