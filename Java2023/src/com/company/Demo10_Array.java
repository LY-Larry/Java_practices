package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Demo10_Array {
    public static void main(String[] args) {
        // Declare array, type of elements
        int[] arr;
        // Set space for array
        arr = new int[5];
        arr[0] = 60;
        arr[1] = 61;
        arr[2] = 62;
        arr[3] = 63;
        arr[4] = 64;
        System.out.println(arr[0]);
        //除了基本数据类型之外都是引用数据类型 int[] String[] 用于记录地址
        // arr with 0xa0a0a0a0 address created on stack int[] arr
        // Using address stored in stack we can locate storage in heap with address arr[0];
        // int takes four bites, then next element will be stored in 0xa0a0a0a4

        //一线赋值
        int[] arr2 = new int[]{81, 82, 83, 84, 85};
        int[] arr3 = {91, 92, 93, 94, 95}; //shortcut removed new int[]
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // Find sum of the array
        int sum = 0;
        int[] theArray = {22, 34, 23, 45, 56};
        for (int i = 0; i < theArray.length; i++) {
            sum += theArray[i];
        }
        System.out.println("The sum of the " + Arrays.toString(theArray) + " is " + sum);
        // Guess number whether it's in an Array
        System.out.println("Please enter a number to check whether it's in array");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        boolean bfound = false;
        for (int i = 0; i < theArray.length; i++) {
            if (guess == theArray[i]) bfound = true;
            break;
        }
        System.out.println(bfound ? "Yes it's in array" : "No it's not in array");
    }
}
