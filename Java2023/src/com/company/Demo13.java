package com.company;

public class Demo13 {
    public static void main(String[] args) {
        int num = 9;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + i + " = " + (i * i) + "\t");
            }
            System.out.println();
        }
    }
}
