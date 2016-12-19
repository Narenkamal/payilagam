package com.payilagam.java;

public class Customer {
	String name1="sam";
	int id1=123;
	long loan1=5000;
	String name2="ravi";
	int id2=124;
	long loan2=10000;
public static void main(String[] args) {
	
		//naren.balance();
		//naren.withdraw();
	    //naren.deposit();
	    //naren.interest();
	    Customer customer=new Customer();
	    Bank Statebank=new Bank(customer);
		Statebank.getcustomerdetails(customer);
		

	}


	

	private void interest() {
		// TODO Auto-generated method stub
		
	}




	


	private static void balance() {
		// TODO Auto-generated method stub
		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

}
