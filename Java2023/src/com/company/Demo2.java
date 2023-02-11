package com.company;

public class Demo2 {
    public static void main(String[] args) {
        //UTF-8 英文一个字节，中文三个字节，每款浏览器必须支持UTF-8
        final int age = 20; //turn var into const
        // alt shift: move lines
        System.out.println(age);
        // common data type
        int year = 2000;
        double pi = 3.14;
        char letter = 'H';
        String message = "Happy New Year";
        System.out.println("This year is "+ year + message);

        //Java 在c++上改进使用前声明必须赋值，用const名字必须全部大写
        final int YEAR = 2023;

    }

}
