package com.company;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        //小数是模拟近似值无法使用 == 进行对比
        //添加精度单位保证运行
        Double precision = 0.00001;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一位小数：");
        Double decimal1 = scanner.nextDouble();
        System.out.println("请输入第二位小数：");
        Double decimal2 = scanner.nextDouble();
        System.out.println("请输入第三位小数：");
        Double decimal3 = scanner.nextDouble();
        if (decimal1 + decimal2 >= decimal3 - precision && decimal1 + decimal2 <= decimal3 + precision) System.out.println("d1 + d2 = d3");
        else System.out.println("d1 + d2 != d3");
    }
}
