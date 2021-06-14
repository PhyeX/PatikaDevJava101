package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz");
	int month = scan.nextInt();
	while( month > 12  || month < 0 ) {
        System.out.println("Lütfen geçerli bi ay giriniz");
        month = scan.nextInt();
    }
        System.out.println("Doğduğunuz günü giriniz");
	int day = scan.nextInt();

	while( day > 31 || day < 0){
        System.out.println("Lütfen geçerli bir gün giriniz");
        day = scan.nextInt();
        if( month == 2  && day > 28) {
            day = -1;
        }
    }
       // Oğlak Burcu : 22 Aralık - 21 Ocak
        if( month == 1) {
            if ( day < 21 )
                System.out.println("Oğlak Burcu");
            else{
                System.out.println("Kova Burcu");
            }
        }
       // Kova Burcu : 22 Ocak - 19 Şubat
        if( month == 2){
            if( day <= 19)
                System.out.println("Kova Burcu");
            else{
                System.out.println("Balık Burcu");
            }
        }
        //Balık Burcu : 20 Şubat - 20 Mart
        if( month == 3 ){
            if( day <= 20 )
            System.out.println("Balık Burcu");
            else
            System.out.println("Koç Burcu");
        }
        //Koç Burcu : 21 Mart - 20 Nisan
        if( month == 4 ){
            if ( day <= 20 )
                System.out.println("Koç Burcu");
            else
                System.out.println("Boğa Burcu");
        }
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        if( month == 5 ){
            if( day <= 21 )
                System.out.println("Boğa Burcu");
            else{
                System.out.println("İkizler Burcu");
            }
        }
//        İkizler Burcu : 22 Mayıs - 22 Haziran
        if( month == 6 ){
            if( day <= 22 ){
                System.out.println("İkizler Burcu");
            }else{
                System.out.println("Yengeç Burcu");
            }
        }

//        Yengeç Burcu : 23 Haziran - 22 Temmuz
        if( month == 7 ){
            if ( day <= 22 )
                System.out.println("Yengeç Burcu");
            else
                System.out.println("Aslan Burcu");
        }

//
//        Aslan Burcu : 23 Temmuz - 22 Ağustos
        if( month == 8 ){
            if( day <= 22)
                System.out.println("Aslan Burcu");
            else{
                System.out.println("Başak Burcu");
            }
        }
//
//        Başak Burcu : 23 Ağustos - 22 Eylül
        if( month == 9){
            if( day <= 22){
                System.out.println("Başak Burcu");
            }else{
                System.out.println("Terazi Burcu");
            }
        }
//        Terazi Burcu : 23 Eylül - 22 Ekim
        if( month == 10 ){
            if( day <= 22 ){
                System.out.println("Terazi Burcu");
            }else{
                System.out.println("Akrep Burcu");
            }
        }
//        Akrep Burcu : 23 Ekim - 21 Kasım
        if( month == 11 ){
            if( day <= 21 )
                System.out.println("Akrep Burcu");
            else
                System.out.println("Yay Burcu");
        }

//        Yay Burcu : 22 Kasım - 21 Aralık
        if( month == 12 ){
            if ( day <= 21 )
                System.out.println("Yay Burcu");
            else{
                System.out.println("Oğlak Burcu");
            }
        }

    }
}
