package com.payilagam.java;

class vehicle {
	String color;
	int speed;
	int gear;
	int model;
	int cc;
	public void attributes(){
		System.out.println("color="+color);
		System.out.println("speed="+speed);
		System.out.println("gear="+gear);
		System.out.println("model="+model);
		System.out.println("cc="+cc);
	}
}
	 class bike extends vehicle {
		
		public void attributesbike(){
			
			}
	}
	 class Car extends bike{
		 public void attributecar(){
			    }
	 }
	 public class Test{
		 public static void main(String[] args){
			 Car  b=new Car ();
			 b.cc=100;
			 b.speed=160;
			 b.color="blue";
			 b.gear=5;
			 b.model=4356;
			 b.attributecar();
			b.attributesbike();
			b.attributes();
			 
		 }
	 }
