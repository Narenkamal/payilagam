package com.payilagam.java;
class hi extends Thread{
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
class hello extends Thread{
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
public class Threaddemo {

	public static void main(String[] args) {
		hi obj=new hi();
		hello obj1=new hello();
		//obj.show();
       //obj1.show();
obj.start();
try {
	Thread.sleep(10);
} catch (Exception e) {

	e.printStackTrace();
}
obj1.start();
	}

}
