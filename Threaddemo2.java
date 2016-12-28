package com.payilagam.java;
public class Threaddemo2 {
	public static void main(String[] args) {
		Runnable obj=()->
		{
			for(int i=1;i<5;i++){
				System.out.println("hi");
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
			
					e.printStackTrace();
				}
			}
		}
		;
		Runnable obj1=()->
		{
			for(int i=1;i<5;i++){
				System.out.println("hello");

		
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
			
					e.printStackTrace();
				}
			
			}
		}
		;
		//obj.show();
       //obj1.show();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
t1.start();
try {
	Thread.sleep(10);
} catch (Exception e) {

	e.printStackTrace();
}
t2.start();
	}


}
