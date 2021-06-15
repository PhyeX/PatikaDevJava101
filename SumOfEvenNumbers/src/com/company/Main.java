package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int total = 0;
	while(true){
	    int number = scan.nextInt();
	    if( number == -1)
	        break;
	    if ( number % 4 == 0 )
	        total += number;

    }

        System.out.println("Toplam "+total);
    }
}
