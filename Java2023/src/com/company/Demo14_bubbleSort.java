package com.company;

import java.util.Arrays;

public class Demo14_bubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,45,62,384,13,26};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int[][] arr_nested = {
                {1,2,3}, {4,5,6}, {7,8,9}
        };
        System.out.println(Arrays.deepToString(arr_nested));
        System.out.println(Arrays.toString(arr_nested[1]));
    }
}
