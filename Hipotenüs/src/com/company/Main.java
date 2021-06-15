package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner( System.in );
        int a,b,c;
        Float hipotenüs;
        System.out.println("Enter first edge : ");
        a = scan.nextInt();
        System.out.println("Enter second edge : ");
        b = scan.nextInt();
        System.out.println("Enter third edge :");
        c = scan.nextInt();
        int u = ( a + b + c ) / 2 ;
        int perimeter =  2 * u;
        double area  = Math.sqrt( u * ( u - a ) * ( u - b ) * ( u - c ) );

        System.out.println(area);





    }
}
