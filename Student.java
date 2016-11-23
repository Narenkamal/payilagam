package com.payilagam.java;

import java.util.Scanner;

public class Student {
	private static final int avg = 0;

	public static void main(String[] args){
	Student marks=new Student();
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the student marks");
	int tamil=in.nextInt();
	int english=in.nextInt();
	int maths=in.nextInt();
	int science=in.nextInt();
	int socialscience=in.nextInt();
	System.out.println("total in the main method is="+marks.add(tamil,english,maths,science,socialscience));
	int total=marks.add(tamil,english,maths,science,socialscience);
	marks.perc(total);

	
	}
	private int perc(int total) {
		// TODO Auto-generated method stub
		int perc=(int) (total/5);
		System.out.println("perc is="+perc);
	
		if(perc>=50)
		{
			System.out.println("the grade is E");
		}
			else
				if(50>=60)
				{
					System.out.println("the grade is D");
				}
				else
					if(60>=70)
					{
						System.out.println("the grade is C");
					}
					else
						if(70>=80)
						{
							System.out.println("the grade is B");
						}
						else
							if(80>=90)
							{
								System.out.println("the grade is A");
							}
							else
							{
								System.out.println("the grade is RA");
							}
		return perc;
		
	
		
	}
	private int add(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stub
		int total=a+b+c+d+e;
		return total;
		
		
	}

}
