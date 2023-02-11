package com.company;

import java.io.File;

public class Demo17_file {
    public static void main(String[] args) {
        showFiles(new File("C:\\Users\\chnle\\Desktop\\Java\\test"));
    }
    public static void showFiles(File file){
        File[] files = file.listFiles(); //
        for (File f : files != null ? files : new File[0]){
            if(f.isFile()) System.out.println(f.getName());
            if(file.isDirectory()) showFiles(f);
        }
    }
}
