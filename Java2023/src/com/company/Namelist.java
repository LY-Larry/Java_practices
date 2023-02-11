package com.company;

public class Namelist {
    String[] names = new String[5];

    public void addNames(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;

            }
        }
    }

    public void showNames() {
        System.out.print("Student names: ");
        for (String n : names) {
            if (n != null) System.out.println(n);
        }
    }
}

