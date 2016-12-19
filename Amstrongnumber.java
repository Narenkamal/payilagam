package com.payilagam.java;

public class Amstrongnumber {

	public static void main(String[] args) {
		int n=153,r,s = 0;
		int temp=n;
		while(n>0){
			r=n%10;
			n=n/10;
			s=s+r*r*r;
		}
		if(temp==s){
			System.out.println("the number is Astrong number");
		}else{
			System.out.println("the number is not Astrong number");
		}

	}

}
