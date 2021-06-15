package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir rakam gir ");
        int digit = scan.nextInt();
        int sum = 0 ;
        while ( digit > 0){
            sum += digit % 10;
            digit /= 10;
        }
        System.out.println(sum);
    }
}
