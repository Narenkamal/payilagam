package com.payilagam.java;

class vehicle {
	String color;
	int speed;
	int gear;
	public void attributes(){
		System.out.println("color"+color);
		System.out.println("speed"+speed);
		System.out.println("gear"+gear);
	}
}
	 class Bike extends vehicle {
		int cc;
		int model;
		public void attributesbike(){
			System.out.println("color="+color);
			System.out.println("speed="+speed);
			System.out.println("gear="+gear);
			System.out.println("model="+model);
			System.out.println("cc="+cc);
			}
	}
	 public class Test{
		 public static void main(String[] args){
			 Bike b=new Bike();
			 b.cc=100;
			 b.speed=160;
			 b.color="blue";
			 b.gear=5;
			 b.model=4356;
			 b.attributesbike();
			 
		 }
	 }
