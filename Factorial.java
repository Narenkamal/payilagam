package com.payilagam.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,fact=1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("factorial number is="+fact);

	}

}
