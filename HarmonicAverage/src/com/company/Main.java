package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(harmonic(numbers));
    }
    static float harmonic(int arr[])
    {

        float sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum +  (float)1 / arr[i];

        return  arr.length/sum;
    }
}
