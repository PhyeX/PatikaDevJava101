package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Mesafeyi km türünden giriniz : ");
        int km = scan.nextInt();
        if( km < 0 ) flag = false;
        System.out.println("Yaşınızı giriniz ");
        int age = scan.nextInt();
        if( age < 0 ) flag = false;
        System.out.println("Yolculuk tipini giriniz ( 1 => Tek Yön ,2 => Gidiş Dönüş )");
        int selection = scan.nextInt();
        if ( ! (selection > 0 && selection < 3) ) flag = false;

        double discount = 0.30;
        if( age < 12 ) discount = 0.50;
        if(age < 24 ) discount = 0.10;
        if( age < 65) discount = 1.00;
        if(flag) {
            if (selection == 1){
                double total = ( km * 0.10 ) * discount;
                System.out.println("Toplam Tutar "+total);
            }else{
                double total =  ( km * 0.10 * 2 ) * discount * 0.20;
                System.out.println("Toplam Tutar "+total);
            }

        }else{
            System.out.println("Hatalı Veri Girdiniz ! ");
        }


    }
}
