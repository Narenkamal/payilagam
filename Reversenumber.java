package com.payilagam.java;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,reverse=0;
		System.out.println("enter the number press");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		while(n!=0)
		{
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
System.out.println("the reverse number is="+reverse);
	}

}
