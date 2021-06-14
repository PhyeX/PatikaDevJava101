package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl Giriniz :");
        int year = scan.nextInt();
        if (year % 4 != 0) {
            System.out.println(year + "artık bir yıl değildir");
        } else if (year % 400 == 0) {
            System.out.println(year + "artık bir yıldır");
        } else if (year % 100 == 0) {
            System.out.println(year + "artık bir yıl değildir!");
        } else {
            System.out.println(year + "artık bir yıldır");
        }

    }
}
