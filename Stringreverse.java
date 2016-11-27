package com.payilagam.java;

import java.util.Scanner;

public class Stringreverse {
	private static int length;

	public static void main(String[] args){
		System.out.println("enter the String");
		Scanner in=new Scanner(System.in);
		String orginal,reverse="    ";
		orginal=in.nextLine();
		length=orginal.length();
		for(int i=length-1;i>=0;i--){
			reverse=reverse+orginal.charAt(i);
		}
		System.out.println("reverse string is"+reverse);
	}

}
