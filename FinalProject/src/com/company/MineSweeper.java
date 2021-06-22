package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    char arr[][];
    char bomb[][];
    int safeZone;
    boolean gameFinished;
    public MineSweeper(int row,int column) {
        Random ran = new Random();
        gameFinished= false;
       arr = new char[row][column];
       bomb = new char[row][column];
       int bombSize = row * column / 4;
       safeZone = row *column - bombSize;
        for (char [] rowArr : arr)
            Arrays.fill(rowArr,'-');

        while( bombSize > 0){
            int a = ran.nextInt(row);
            int b = ran.nextInt(column);
            if( bomb[a][b] != '*') {
                bomb[a][b] = '*';
                bombSize--;
            }

        }


    }

    public void run(){
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        while (!gameFinished){
            writeArr();
            getInput();
        }
        if(safeZone == 0){
            System.out.println("Oyunu kazandın!");
        }else{
            System.out.println("Game Over!!");
        }
    }

    public void writeArr(){
        for( int i = 0; i < arr.length; i++ ){
            for( int k = 0; k < arr[i].length ; k++ ){
                System.out.print(arr[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Satır Giriniz ");
        int row = scan.nextInt();
        System.out.print("Sütun Giriniz ");
        int column = scan.nextInt();
        openSelection(row,column);
    }
    public void openSelection(int row ,int column) {

        int cnt = 0;
        if(bomb[row][column] == '*' ) {
            gameFinished = true;
            return;
        }
        for (int i = -1; i < 2; i++) {
            for (int k = -1; k < 2; k++) {
                try {
                    if (bomb[row + i][column + k] == '*')
                        cnt++;
                } catch (Exception e) {

                }
            }
        }

        arr[row][column] = (char)(cnt+'0');
        safeZone--;
        if( safeZone == 0 )
            gameFinished = true;
    }
}
