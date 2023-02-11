package com.company;

import java.util.Scanner;

public class Demo20_ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter your name: ");
            String name = scanner.next();
            if (name.equals("n")) break;
            //应用数据使用 == 仅对比地址不对比内容
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();
            Ticket ticket = new Ticket();
            ticket.name = name;
            ticket.age = age;
            ticket.print_ticket();

        }
        System.out.println("System exit");
    }

}
