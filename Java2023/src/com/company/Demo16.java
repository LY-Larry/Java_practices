package com.company;

import java.util.Arrays;

public class Demo16 {
    public static void main(String[] args) {
        //引用数据类型仅在栈中储存堆的address，通过address改动内容会保存
        int[] y = {10, 20, 30};
        f_change(y);
        System.out.println(Arrays.toString(y));
    }
    public static void f_change(int[] x){
        System.out.println(Arrays.toString(x));
        x[1]++;
        System.out.println(Arrays.toString(x));
    }
}
