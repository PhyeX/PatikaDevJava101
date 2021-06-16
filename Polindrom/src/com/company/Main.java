package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrom(343));
    }

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }
}
