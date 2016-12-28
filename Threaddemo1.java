package com.payilagam.java;
class Keep implements Runnable{
	public void run(){
		for(int i=1;i<5;i++){
			System.out.println("hi");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
		
				e.printStackTrace();
			}
		}
	}
}
class Sorry implements Runnable{
	public void run(){
		for(int i=1;i<5;i++){
			System.out.println("hello");

	
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
		
				e.printStackTrace();
			}
		
		}
	}

	
}
public class Threaddemo1 {
	public static void main(String[] args) {
		Keep obj=new Keep();
		Sorry obj1=new Sorry();
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
