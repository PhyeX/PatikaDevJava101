package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("N Sayısı : ");
        int n = scan.nextInt();
        System.out.print("Çıktısı : " );
        func(n,true ,n);


    }
    static void func(int number ,boolean flag, int start){
       if(number < 0 ) flag = false;
        System.out.print(" "+ number);
        if(flag) {
            func(number-5,flag,start);
        }else{
            if( number == start )
                return;
            func(number+5,flag,start);

        }

    }
}
