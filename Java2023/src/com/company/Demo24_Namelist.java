package com.company;

public class Demo24_Namelist {
    public static void main(String[] args) {
        Namelist namelist = new Namelist() ;
        namelist.showNames();
        namelist.addNames("Kate");
        namelist.addNames("Bob");
        namelist.addNames("Larry");
        namelist.showNames();
    }
}
