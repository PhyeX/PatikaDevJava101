package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for( int i = 2 ; i < 100 ; i++ ){
            if( i % 2 == 0 && i!=2) continue;
            boolean flag = true;
            for(int k = 3  ; k < i ; k+=2 ){
                if(i % k == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(i+" ");
        }
    }
}
