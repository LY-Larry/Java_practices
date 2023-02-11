package com.company;

public class Demo12_Shapes {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i<=num; i++){
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
