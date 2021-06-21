package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y, z;
        Scanner scan = new Scanner(System.in);
        System.out.println("Rakam gir");
        int digit = scan.nextInt();
        x = 0;
        y = 1;
        z = 0;
        for (int i = 0; i < digit; i++) {
            System.out.print(y + " ");
            z = x + y;
            x = y;
            y = z;
        }
    }
}
