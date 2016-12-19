package com.payilagam.java;

public class Swapnumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		Swap(a,b);

	}

	private static void Swap(int a, int b) {
		// TODO Auto-generated method stub
		int c = a;
		a=b;
		b=c;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
