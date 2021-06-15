package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scan = new Scanner(System.in);
       // C(n,r) = n! / (r! * (n-r)!)
        System.out.println("Enter n");
        int n = scan.nextInt();
        System.out.println("Enter r");
        int r = scan.nextInt();

        int facN = IntStream.rangeClosed(1 ,n).reduce(1,(int x ,int y) -> x * y );
        int facR = IntStream.rangeClosed(1 ,r).reduce(1,(int x ,int y) -> x * y );
        int facSum = IntStream.rangeClosed(1 ,n-r).reduce(1,(int x ,int y) -> x * y );
        System.out.println("Total "+(facN / (facR *  facSum) ) );
    }
}
