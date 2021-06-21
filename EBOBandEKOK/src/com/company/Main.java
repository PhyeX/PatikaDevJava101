package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("İlk rakamı giriniz ");
        int first = scan.nextInt();
        System.out.println("İkinci rakamı giriniz ");
        int second = scan.nextInt();
        int k = first;
        int ebob =  1;

        while( k >= 1 ){
            if( first % k == 0 && second % k == 0){
                ebob = k;
                break;
            }
            k--;
        }

        int i = 1;
        while( i <= ( first * second ) ){
            if ( i % first == 0  && i % second == 0 ){
                System.out.println(i);
                break;
            }
            i++;
        }
        System.out.println((first*second) / ebob);
    }
}
