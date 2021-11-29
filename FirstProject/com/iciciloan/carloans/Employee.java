package com.iciciloan.carloans;

public class Employee {

	int eno;

	String ename;
	
	//this is constructor without any parameter
	public Employee() 
	
	{
	System.out.println("I am default constructor");	
	}
	
	//this is constructor with two parameter constructor, here one parameter is integer and another parameter is string type
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	//this is constructor with one parameter constructor
public Employee(int eno) {
		super();
		this.eno = eno;
	}

//every 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		
		Employee e2 = new Employee(1744, "Uma");
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		
		Employee e3 = new Employee(90);
		System.out.println(e3.eno);
		
		

	}

}
