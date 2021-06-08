package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int math,music,history,turkish,chemistry,physics;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your math grade: ");
        math = scan.nextInt();
        System.out.println("Enter your music grade: ");
        music = scan.nextInt();
        System.out.println("Enter your history grade: ");
        history = scan.nextInt();
        System.out.println("Enter your chemistry grade: ");
        chemistry = scan.nextInt();
        System.out.println("Enter your turkish grade: ");
        turkish = scan.nextInt();
        System.out.println("Enter your physics grade: ");
        physics = scan.nextInt();

        float average = (float)(math + music + history + chemistry + turkish + physics )/ 6 ;
        System.out.println("Your average grade : " + average);
        System.out.println( average > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
        // Ödevde öyle diye son kısım türkçe oldu ama olsun bakalım :D

    }
}
