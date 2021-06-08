package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amount = scan.nextInt();

        float KDV = amount > 1000 ? 8.0f : 18.0f ;
        float KDV_amount = (amount * KDV ) / 100  ;
        System.out.println("KDV'siz Fiyat = "+amount);
        System.out.println("KDV'li Fiyat = "+(amount + KDV_amount));
        System.out.println("KDV tutarı = "+ KDV_amount);



    }
}
