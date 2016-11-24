package com.payilagam.java;

import java.util.Scanner;

public class Studentmark {
	private static final int Studentcount = 0;
	private static int perc;

	public static void main(String[] args)
	{
       int sub1,sub2,sub3,sub4,sub5;
       do{
       int Studentcount=0;
       Studentcount=Studentcount+1;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the student name");
       String name1=in.nextLine();
    
       System.out.println("Enter the five subject marks");
       System.out.println("enter sub1 mark");
       sub1=in.nextInt();
       System.out.println("enter sub2 mark");
       sub2=in.nextInt();
       System.out.println("enter sub3 mark");
       sub3=in.nextInt();
       System.out.println("enter sub4 mark");
       sub4=in.nextInt();
       System.out.println("enter sub5 mark");
       sub5=in.nextInt();
       int total=sub1+sub2+sub3+sub4+sub5;
	System.out.println("Total is="+total);
	float perc=total/5;
	}while(Studentcount<=5);
}
	
}