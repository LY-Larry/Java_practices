package com.company;

public class Demo19_School {
    public static void main(String[] args) {
        School school = new School(); //
        School school2 = new School(); //
        school.show(); // space in heap has been cleared for data entry
        school.name = "Balwyn High School";
        school.jfNumber = 36;
        school.jsNumber = 8;

        school2.name = "Kew High School";
        school2.jfNumber = 40;
        school2.jsNumber = 20;
        //访问方法
        school.show();
        school2.show();

    }
}
