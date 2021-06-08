package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        int r = scan.nextInt();
        System.out.println("Enter the angle of cirle");
        double angle = scan.nextDouble();

        double area = ( pi * ( r * r ) * angle) / 360;
        System.out.println("Area : "+area);


    }
}