package com.company;

public class Demo15_function {
    public static void main(String[] args) {
        // void means no return main(args) is the method and arguments
        f01();
        f01(1);
        f01(1.0);
        f02(12,"Larry");
        f_arr(1,2,3,4,5);
    }

    public static void f01() {
        System.out.println("f01 has been called");
    }

    public static void f01(int x1) {
        System.out.println("f01 int has been called");
    }

    public static void f01(Double x2) {
        System.out.println("f01 double has been called");
    }

    public static void f02(int age, String name) {
        System.out.println("My name is " + name + " And I am " + age + " years old");

    }

    public static void  f_arr(int... arr){
        System.out.println("f_arr has been called");
        for (int a : arr){ //for each
            System.out.println(a);
        }
    }

}
