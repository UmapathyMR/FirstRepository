package com.iciciloan.carloans;

public class ConstructorSample {

	
	public ConstructorSample()
    {
		
		System.out.println("I am defualt constructor..");
    }

	//default constructor or any constructor will be called only during the class object creation, if 
	//there is no class object created, then the constructor will not be called...
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorSample c = new ConstructorSample();
	
	}

}
