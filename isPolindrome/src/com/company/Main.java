package com.company;

public class Main {

    static boolean isPalindrome(String str){

        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }
}
