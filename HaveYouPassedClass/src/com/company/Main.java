package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz ");
        int mat = isValid(scan.nextInt());
        System.out.println("Fizik notunuzu giriniz ");
        int pyhsic = isValid(scan.nextInt());
        System.out.println("Türkçe notunuzu giriniz ");
        int turkish = isValid(scan.nextInt());
        System.out.println("Kimya notunuzu giriniz ");
        int chem = isValid(scan.nextInt());
        System.out.println("Müzik Notunuzu giriniz");
        int music = isValid(scan.nextInt());

        int average = ( mat + pyhsic + turkish + chem + music ) / 5;
        if( average >= 55)
            System.out.println("Sınıfı geçtiniz");
        else{
            System.out.println("Sınıfta kaldınız");
        }
    }

    static int isValid(int number){
        if( number > 100 || number < 0)
            return 0;

        return number;
    }
}
