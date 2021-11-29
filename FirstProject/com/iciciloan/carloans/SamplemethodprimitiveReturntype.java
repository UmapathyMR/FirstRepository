package com.iciciloan.carloans;


public class SamplemethodprimitiveReturntype {

	public static int add(int a, int b) 
	
	//so, here, strictly we have to use the return keyword within the method, where we are not using void keyword, this means we
	//are not returning anything...within that method.. here int is primitive return type
	{
		
		int c;
		c = a+b;
		return c;
	
	}
	
	
	//in the below main method, we are creating the object count and count1 to call the value of the add() method above ...
	//since it is not having void keyword and having int (primitive datatype) as return type, so, we can create object
	//in the main method, to call the add()method..
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int count = SamplemethodprimitiveReturntype.add(10, 20);
	
	int count1 = add(10, 20);
	System.out.println("Result of A+B" + "=" + count);
	System.out.println("Result of A+B" + "=" + count1);
	}

}

