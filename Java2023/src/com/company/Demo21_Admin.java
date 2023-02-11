package com.company;

import java.util.Scanner;

public class Demo21_Admin {
    public static void main(String[] args) {
        boolean first = true;
        while (true) {
            String name;
            int password;
            Admin admin = new Admin();
            Scanner scanner = new Scanner(System.in);
            if (first == true) {
                System.out.print("Please sign up your Admin name (strings only): ");
                name = scanner.next();
                admin.name = name;
                System.out.print("Please set your password (Integers only): ");
                password = scanner.nextInt();
                admin.password = password;
                first = false;
            }
            System.out.println("Enter your Admin name and password should you wish to change password");
            System.out.print("Please enter your Admin: ");
            name = scanner.next();
            System.out.print("Please enter your password: ");
            password = scanner.nextInt();

            if (admin.name.equals(name) && admin.password == password){
                System.out.print("Please set your new password (Integers only): ");
                password = scanner.nextInt();
                admin.password = password;
                System.out.println("Password successfully changed");
            }else {
                System.out.println("Sorry your input doesn't match!");
            }
            System.out.println("Quit or continue? (y/n)");
            String quit = scanner.next();
            if (quit.equals("y")) break;
        }
    }
}
