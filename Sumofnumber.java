package com.payilagam.java;

import java.util.Scanner;

public class Sumofnumber {
	public static void main(String[] args){
		int n=0,sum=0,a=0;
		System.out.println("Enter the number to press");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		while(n!=0){
			a=n%10;
			n=n/10;
			sum=sum+a;
			
		}
		System.out.println("sum is="+sum);
	}

}
