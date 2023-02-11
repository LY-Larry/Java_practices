package com.company;

public class Demo18 {
    public static void main(String[] args) {
        count(100);
    }
    public static int count(int num){
        if (num == 1) return 1;
        System.out.println(num);
        return count(num - 1);
    }
}
