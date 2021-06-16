package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
  	Scanner scan = new Scanner(System.in);
        int km;
        double perKm = 2.20, total, startPrice = 10;
        System.out.println("Km giriniz : ");
        km = scan.nextInt();
        total = (km * perKm);
        total += startPrice;
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar : " + total);


    }
}
