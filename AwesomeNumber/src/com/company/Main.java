package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Bir sayı giriniz : ");
        int digit = scan.nextInt();

        int counter = 0;
        for (int i = 1; i < digit; i++) {
            if (digit % i == 0)
                counter += i;

        }

        System.out.println(digit + " Mükemmel " + (
                counter == digit ? "sayıdır" : "sayı değildir."));

    }

}
