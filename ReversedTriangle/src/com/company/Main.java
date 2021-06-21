package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Basamak sayısı :");
    int digit = scan.nextInt() * 2;
	for ( int i = 0 ; i < digit ; i++ ){

	    for( int k = digit-i ; k < digit ; k++ ){
            System.out.print(" ");
        }
        for( int k = digit-i*2-1 ; k > 0 ; k-- ){
            System.out.print("*");
        }

        for( int k = digit-i ; k < digit ; k++ ){
            System.out.print(" ");
        }
        System.out.println();
    }


    }
}
