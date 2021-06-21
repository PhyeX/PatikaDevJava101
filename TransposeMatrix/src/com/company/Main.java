package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{
                {2, 3, 4},
                {5, 6, 4}
        };
        System.out.println("Matris : ");
        for( int i = 0 ; i < matrix.length ; i++){
            for( int k = 0; k < matrix[i].length ; k++ ){
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }
        int[][] transpoze = new int[matrix[0].length][matrix.length];

        for( int i = 0 ; i < matrix.length ; i++){
            for( int k = 0; k < matrix[i].length ; k++ ){
                transpoze[k][i] = matrix[i][k];
            }
        }

        System.out.println("Transpoze : ");
        for( int i = 0 ; i < transpoze.length; i++){
            for( int k = 0; k < transpoze[i].length; k++ ){
                System.out.print(transpoze[i][k]+" ");
            }
            System.out.println();
        }


    }
}
