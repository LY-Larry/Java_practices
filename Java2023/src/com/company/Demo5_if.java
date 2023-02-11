package com.company;

import java.util.Scanner;

public class Demo5_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = scanner.nextInt();
        if(a>0){
            System.out.println("a is larger than 0");;
        }else {
            System.out.println("a isn't larger than 0");
        }
        int b=10;
        if (b==10) System.out.println("b is 10");
        else if (b != 10)System.out.println("b is not 10");
    }
}
