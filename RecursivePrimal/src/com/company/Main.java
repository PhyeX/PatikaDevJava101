package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Sayı Giriniz : ");
    int digit = scan.nextInt();
    if(func(digit,digit)){
        System.out.println(digit+" sayısı ASAL değildir!");
    }else{
        System.out.println(digit+" sayısı ASALDIR!");
    }

    }

    static boolean func( int i ,int digit ){
        if (digit == 2 )
            return false;
        if( digit % 2 == 0 )
            return true;
        if( i == 1 )
            return false;
        if( digit % i == 0 && i!=digit )
            return true;


    return func(i-1,digit);
    }
}
