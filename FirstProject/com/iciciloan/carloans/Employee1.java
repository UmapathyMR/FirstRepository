package com.iciciloan.carloans;

public class Employee1 {

	String str;
	
	
	public Employee1(String str) {
		super();
		this.str = str;
	}

	
	  public void m1() { 
		  
		  this.m1(); 
		  System.out.println("Uma");
		  
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 obj = new Employee1("Uma");
		obj.m1();
		 System.out.println();
	}

}
