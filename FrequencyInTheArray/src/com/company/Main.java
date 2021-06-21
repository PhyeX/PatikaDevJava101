package com.company;

public class Main {

    public static void main(String[] args) {
	int [] arr = new int []{10, 20, 20, 10, 10, 20, 5, 20};

	int [] unieqe = new int [arr.length];
    int counter = 0;
	for (int i = 0; i < arr.length ; i++){
		boolean flag = true;
	    for( int k = 0; k < unieqe.length ; k++ ){
	        if(unieqe[k] == arr[i] ){
	        	flag =false;
				break;
			}
        }
	    if(flag)
	    unieqe[counter++] = arr[i] ;
	}
	for( int i = 0 ; i < counter ; i++ ){
		int cnt = 0 ;
		for( int k = 0 ; k < arr.length ; k++ ){
			if( unieqe[i] == arr[k])
				cnt++;
		}
		System.out.println(unieqe[i]+" sayısı " + cnt + " kadar tekrar edildi.");
	}


    }
}
