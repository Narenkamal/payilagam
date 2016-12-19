package com.payilagam.java;

import java.util.Scanner;

public class Primeornot1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();
		boolean isprime=true;
		for(int i=2;i<n;i++){
		if(n%i==0){
			isprime=false;
			break;
		}
		
    	 
     }if(isprime){
			System.out.println("the number is prime number");
     }else
     {
			System.out.println("the number is not prime number");
		}

	}

}
