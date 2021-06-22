package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.println("Satır sayısınız giriniz ");
        int row = scan.nextInt();
        System.out.println("Sütun sayısını giriniz ");
        int column = scan.nextInt();

        MineSweeper mine = new MineSweeper(row,column);
        mine.run();
    }
}
