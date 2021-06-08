package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double height = scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        double weight = scan.nextDouble();
        //Formüla  Kilo (kg) / Boy(m) * Boy(m)
        double result = weight / ( height * height );
        System.out.println(result);

    }
}
