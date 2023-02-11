package com.company;
import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        //Scanner usage
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        System.out.println("Your name is " + name);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age );
    }
}
