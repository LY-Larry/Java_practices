package com.company;

import java.util.Scanner;

public class Demo7_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your place number");
        int yourPlace = scanner.nextInt();
        //Switch doesn't support long float double since decimals are approximation
        switch (yourPlace) {
            case 1:
                System.out.println("You won GOLD MEDAL!");
                break;
            case 2:
                System.out.println("You won SILVER MEDAL!");
                break;
            case 3:
                System.out.println("You won BRONZE MEDAL!");
                break;
            case 4:
            case 5:
                System.out.println("You didn't reach top 3");
                break;
            default:
                System.out.println("Sorry you didn't win!");
        }
    }
}
