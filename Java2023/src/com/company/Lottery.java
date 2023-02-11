package com.company;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lottery draw \n");
        System.out.println("Please enter your four digit lucky number");
        int id = scanner.nextInt();
        int hundredth = id / 100 % 10;
        int luck = (int) (Math.random()*10);
        System.out.println("luck number is " + luck);
        if (hundredth == luck) System.out.println("Congratulations! You won!");
        else System.out.println("Sorry, better luck next time");
    }
}
