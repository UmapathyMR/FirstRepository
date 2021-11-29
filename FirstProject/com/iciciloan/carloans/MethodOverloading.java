package com.iciciloan.carloans;

public class MethodOverloading {

	public void m1(String x) {
		
		System.out.println(x);
		
	}
	
	public void m1(int x) {
		
		System.out.println(x);
		
	}
	
	//here we cannot give m1(int x) for both the methods, instead we use a different method signature to over come this
	//situation and this concept to use the same method name but different paraemter type, this concept is called METHOD OVERLOADING
	//METHOD OVERLOADING HAPPENS WITHIN the same CLASS ONLY
	
	
public void m1(Number x) {
		
		System.out.println(x);
		
	}

public void m1(Integer x) {
	
	System.out.println(x);
	
}

public void m1(Object x) {
	
	System.out.println(x);
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//here while we are calling the method, obj.m1(int type) will look for int method above, if m1(int x) is not available,
		//it will still work, because, it automatically promotes to the float type and uses the m1 (float x) to satisfy its 
		//working
		//this concept is called automatic promotion within the method overloading
		//Automatic promotion: byte-->short--> int--> long --> float --> double
		//so, if int is there in calling and method not available, it will look for any of the higher level types..like long
		//float or double, if any one type is available, then its value will go for it... 
		
		
	MethodOverloading obj = new MethodOverloading();
	obj.m1(12.3f);
	obj.m1(100);
	obj.m1("Umapathy");
	obj.m1(12);
	
		
	}

}
