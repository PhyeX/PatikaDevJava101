package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Taban değeri giriniz");
    int floor = scan.nextInt();
        System.out.println("Üs değerini giriniz");
    int exponential = scan.nextInt();

        System.out.println(func(floor,exponential));
    }

    static int func ( int floor , int exponential){
        if( exponential == 0)
            return 1;

        return floor * func(floor,exponential-1);
    }
}
