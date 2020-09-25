package org.methods;


public class StaticMethodNonStatic {
    public static void display(){
        System.out.println("statement-1");
        System.out.println("statement-2");
    }
    public static int display(int a,int b){
        int result = a + b;
        return result;
    }

    public static String display(String name){
        System.out.println("It returns a string");
        return name;
    }

    public void show(){
        System.out.println("statement-1 - inside non static method");
        System.out.println("statement-2 - inside non static method");
    }

    public int show(int a, int b){
        int result = a + b;
        return result;
    }

    public  String show(String[]  names){
        System.out.println("Names passed are : ");
        for (String str : names)
            System.out.print(str+" ");
        System.out.println();
        System.out.println("This method can return only one string value ...");
        return names[2];
    }

    public static void main(String[] args) {
        display();
        System.out.println("the method returns : "+display("Bablu"));

        int result = display(12,13);

        System.out.println("Sum result of static method Display : "+result);

        System.out.println("Creating object to access the non-static methods ...");

        StaticMethodNonStatic instance = new StaticMethodNonStatic();

        instance.show();

        int result1 =  instance.show(11,22);

        System.out.println("Sum result of non static method Show : "+result1);

        String[] array = new String[] {"Bablu","Bibhu","Suddu"};

        String name = instance.show(array);
//        String name = instance.show(["Bablu","Bibhu","Suddu"]);

        System.out.println("The non static Method returns :"+name);
    }
}

