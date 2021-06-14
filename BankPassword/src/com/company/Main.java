package com.company;

import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String username,password = "";
        String realUsername = "ejderha";
        String realPassword = "java123";
        while(true) {
        System.out.println("Kuallanıcı Adınız : ");
        username = scan.nextLine();
        System.out.println("Şifreniz");
        password = scan.nextLine();

            if (username.equals(realUsername) && password.equals(realPassword)) {
                System.out.println("Giriş Yaptınız ! ");
                break;
            } else {
                System.out.println("Bilgileriniz Yanlış ! ");

                System.out.println("Şifrenizi sıfırlamak ister misiniz? (y/n) ");

                if(scan.nextLine().equals("y"))
                resetPassword(realPassword);
            }
        }

    }
    static void  resetPassword(String realPassword){
        Scanner scan = new Scanner(System.in);
        System.out.println("Yeni şifrenizi giriniz");
        while(true) {
            if (scan.nextLine().equals(realPassword)) {
                System.out.println("Şifre oluşturlamadı lütfen başka şifre giriniz");
            }
            else{
                System.out.println("Şifre oluşturuldu");
            }
        }

    }

}
