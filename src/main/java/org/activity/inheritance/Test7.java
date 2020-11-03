package org.activity.inheritance;

class A
{
    private int i;
    public A(int i)
    {
        this.i = i;
    }

//    public A() {
//    }
}

class B extends A
{
    public B()
    {
        super(10);
    }
}

