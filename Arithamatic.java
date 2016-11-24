package com.payilagam.java;
import java.util.Scanner;
public class Arithamatic {
 public static void main(String[] args){
	 if(args.length==0){
		 System.out.println("No args can be passed ");}
	 else
	 {
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter a first number");
		 int a=in.nextInt();
		 System.out.println("Enter a scend number");
		 int b=in.nextInt();
		 String p=args[1];
		 switch(p)
			{
			case "add":
				int add;
				add=a+b;
				System.out.println("Result is:"+add);
				break;
			case "sub":
				int sub;
				sub=a-b;
				System.out.println("Result is:"+sub);
				break;
			case "mul":
				int mul;
				mul=a*b;
			System.out.println("Result is:"+mul);
			case "div":
				int div;
				div=a/b;
				System.out.println("Result is:"+div);
				break;
			case "mod":
				int mod;
				mod=a%b;
				System.out.println("Result is:"+mod);
				break;
			default:
				System.exit(0);
			}
	 }
}
}
