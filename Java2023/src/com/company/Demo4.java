package com.company;

public class Demo4 {
    public static void main(String[] args) {
        //byte 单字节 -127 - 128
        //short 双字节 -32768 - 32767
        //int 4字节， long 8字节
        int max_int = Integer.MAX_VALUE;
        System.out.println(max_int);
        long max_long = Long.MAX_VALUE;
        System.out.println(max_long);

        //Make sure to grant types when changing variable
        max_long = 212222131l;
        float f = 3.14f;
        //Double has higher precision than float because it has more bytes
        //char 0-65535 no negative编码使用

        char c1 = Character.MIN_VALUE;
        char c2 = Character.MAX_VALUE;
        System.out.println((int) c1);
        System.out.println((int) c2);

        //强行转换
        char A = 'A';
        int i = 1;
        char M = (char)(i+A);
        System.out.println(M);
    }
}
