package com.company;

import java.util.Arrays;

public class Demo11_Array2 {
    public static void main(String[] args) {
        int[] arr = {12,-121,34,111,944,21};
        System.out.println(arr); // when print raw array,[ means array I means integer @4c203ea1 16进制内存地址
        System.out.println(Arrays.toString(arr));

        int[] arr1 = Arrays.copyOf(arr,6);
        System.out.println(Arrays.equals(arr,arr1));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int pos = Arrays.binarySearch(arr,0); //Binary searches location of the selected key, array must be sorted
        System.out.println(pos); //如果找不到，选择想插入点idx负数再-1 return
        Arrays.fill(arr1,11);
        System.out.println(Arrays.toString(arr1));
    }
}
