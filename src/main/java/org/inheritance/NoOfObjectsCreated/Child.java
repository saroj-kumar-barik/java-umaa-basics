package org.inheritance.NoOfObjectsCreated;

public class Child extends Parent {
    public Child() {
        System.out.println(this.hashCode());
        System.out.println(this.getClass());
    }
}
