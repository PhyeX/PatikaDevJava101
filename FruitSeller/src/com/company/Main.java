package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        double pearPrice = 2.15;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;
        double total = 0;
        System.out.println("Armut Kaç Kilo ? :");
        int pearKg = scan.nextInt();
        total += pearKg * pearPrice;
        System.out.println("Elma Kaç Kilo ? :");
        int applekg  = scan.nextInt();
        total += applePrice * applekg;
        System.out.println("Domates Kaç Kilo ? :");
        int tomatoKg = scan.nextInt();
        total += tomatoKg * tomatoPrice;
        System.out.println("Muz Kaç Kilo ? :");
        int bananaKg = scan.nextInt();
        total += bananaKg * bananaPrice;
        System.out.println("Patlıcan Kaç Kilo ? :");
        int eggplantKg = scan.nextInt();
        total += eggplantPrice * eggplantKg;
        System.out.println("Toplam Kaç Kilo ? :"+(pearKg+applekg+tomatoKg+bananaKg+eggplantKg));

        System.out.println("Toplam Tutar : "+total);

    }
}
