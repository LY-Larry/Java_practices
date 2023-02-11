package com.company;

public class Demo8_loop {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (n<=100){
            if (n%2 == 0) sum += n;
            n++;
        }
        System.out.println(sum);

        //Do while loop, run once before condition check
        int m = 0;
        do{
            m++;
        }while(m<0);
        System.out.println(m);

        sum = 0;
        for(int x = 0; x<100; x++){
            if (x==2) continue; //忽略当次
            sum += x;
        }
        System.out.println(sum);
    }

}
