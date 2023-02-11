package com.company;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you a member? (y/n) ");
        String ans = scanner.next();
        if (ans.equals("y")) {
            System.out.println("Welcome to the club");
        } else if (ans.equals("n")) {
            System.out.println("Please sign up first");
        } else {
            System.out.println("Please enter valid answer");
        }
    }
}
