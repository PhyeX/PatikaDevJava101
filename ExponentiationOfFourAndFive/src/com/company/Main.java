package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı gir : ");
        int number = scan.nextInt();

        for( int i = 1 ; i < number ; i++){
            if (Math.pow(4,i) > number)
                break;
            System.out.println("4 ün katları "+Math.pow(4,i));
        }
        for( int i = 1 ; i < number ; i++){
            if (Math.pow(5,i) > number)
                break;
            System.out.println("5 in katları "+Math.pow(5,i));
        }
    }
}
