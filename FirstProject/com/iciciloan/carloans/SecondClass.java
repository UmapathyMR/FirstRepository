package com.iciciloan.carloans;

public class SecondClass 
{

	//data properties or properties
	
	int a =10 , b =20 , result;
	
	//behaviors or methods
	
	public void add()
	
	{	
	result = a+b;
	System.out.println("Addition of A & B is:" + result);
	}
	
public void sub()
	
	{	
	result = a-b;
	System.out.println("Subraction of A & B is:" + result);
	}
	
	//data properties are the inputs that we are using. so here there is 3 data properties,
	// a is one property , b is another property and result is another property which is returning 
	//the value

//behavior having opening and closing {} is called concrete behaviors .. here 
//public void sub() and public void add() , these two are called behaviors..
//class is a collection of objects, so we can create multiple objects under one class and can 
//call those behaviors using the creation of class object variable.. here we have created 
//SecondClass obj = new SecondClass(); in this we created an object called new secondclass and 
//storing into the same class type secondclass..
	
	
	
	public static void main(String[] args) {
		System.out.println("hello...");
		
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		
		SecondClass obj1 = new SecondClass();
		obj1.add();
		
		obj1.sub();
		
		
		
		
	}
}
