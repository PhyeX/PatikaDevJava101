package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Rakam giriniz");
        int digit = scan.nextInt();
        int total = 0;
        int divisor = 0;
        for( int i= 0 ; i < digit ; i++ ){
            if ( i % 3 == 0 && i % 4 == 0) {
                total += i;
                divisor++;
            }
        }
        System.out.println("Ortalama "+ (total / divisor));

    }
}
