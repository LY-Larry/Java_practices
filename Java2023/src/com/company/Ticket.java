package com.company;

public class Ticket {
    String name;
    int age;
    public void print_ticket(){
        if (age <=10) System.out.println("Name: " + name + "\t Age: " +age + "\t fare will be 10$" );
        else System.out.println("Name: " + name + "\t Age: " +age + "\t fare will be 20$" );
    }
}
