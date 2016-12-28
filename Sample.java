package com.payilagam.java;


 interface cat{
	 void eat();
	 void travel();
	 void run();
	 
	 
 }
 interface dog{
	 void eat();
	 void travel();
 }
class Sample implements cat,dog {
	public void eat()
	{
		System.out.println("eating rice");
	}
	public void travel(){
		System.out.println("travel mumbi");
	}
	public void run()
	{
		System.out.println("run road");
	}
	
	public static void main(String[] args)
	{
	Sample obj=new Sample();
	obj.eat();
	obj.run();
	obj.travel();
		}

}
