package com.iciciloan.carloans;

public class SampleMethod {

	//this example is for OOPs concept: Method signature
	//return type is very important, if we want to print the value of the add method within the add method itself, then we use 
	//the keyword void, which means it is not returning anything and so, we can use sysoutprint to print the statement
	//and this is called it is not returning anything....
	//but if we want to print the value of the add method outside the add method, then we use the return type either primitive 
	//or ClassType to print that method value outside that add method...and strictly we use the keyword (either primitive type like
	//int or ClassType like SampleMethod... to print the value outside the method.
	
	public static void add(int a, int b) {
		
		int c;
		c = a+b;
		System.out.println("Result of A+B" + "=" + c);
		
	}
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		//here we are passing the arguments for the parameters a and b outside the method.
		//so, how we are calling the method outside that method for a static method is ....... not by creating object
		//as we cannot create object and call it for static, we have to call directly by using that method
		//or by using that ClassName.method() to call and print it..
		
		SampleMethod.add(10, 20);
		add(10, 20);
		
	}

}
