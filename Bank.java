package com.payilagam.java;

public class Bank {




public Bank(Customer customer) {
	 String customername1=customer.name1;
	 String customername2=customer.name2;
	 System.out.println(customername1+customername2);
	
}
public void getcustomerdetails(Customer Customer){
	
	System.out.println("name is:"+Customer.name1);
	System.out.println("id is:"+Customer.id1);
	
	double interest1=Customer.loan1*0.1;
	System.out.println("interest1 for loan:"+interest1);
	System.out.println("name is:"+Customer.name2);
	System.out.println("id is:"+Customer.id2);
	System.out.println("interest2 for loan:"+Customer.loan2);
	double interest2=Customer.loan2*0.1;
	
}


	}
	
	

	

	


