package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı gir");
        int n1 = scan.nextInt();
        System.out.println("İkinci sayıyı gir");
        int n2 = scan.nextInt();

        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma\n 4-Bölme");
        System.out.println("Seçiminiz : ");
        int selection = scan.nextInt();

        switch (selection){
            case 1:
                System.out.println("Toplam " + ( n1 + n2 ));
                break;
            case 2:
                System.out.println("Çıkarma : "+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma : " + ( n1 *n2 ));
                break;
            case 4:
                if( n2 != 0)
                    System.out.println("Bölme : "+ (n1 / n2));
                else
                    System.out.println("Bir sayı 0'a bölünemez !");
                break;

            default:
                System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz.");


        }

    }
}
