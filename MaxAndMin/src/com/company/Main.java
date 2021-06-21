package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner( System.in );

    System.out.println(" Kaç tane sayı giriceksiniz : ");

    int digit = scan.nextInt();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for( int i = 0 ; i < digit ; i++ ){
        System.out.print((i+1)+". Sayıyı giriniz : ");
        int nextDigit = scan.nextInt();
        max = Math.max(nextDigit,max);
        min = Math.min(nextDigit,min);

    }

    System.out.println("En büyük sayı : " + max );
    System.out.println("En küçük sayı : " + min );







    }
}
