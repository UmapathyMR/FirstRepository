package com.iciciloan.homeloans;

import com.iciciloan.carloans.A;
import com.iciciloan.carloans.B;

public class C extends A //ISA relationship

{

public void m3() {
		
		System.out.println("I am m3 from C");
	}

public void m1() {
	System.out.println("I am overridden m1 in A from C");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A(); //SA relationship
		a.m1();
		System.out.println(a.x);
		
		//B b = new B(); //HAS relationship
		//b.m1();
		//b.m2();
		
		//C c = new C();//HAS relationship
		//c.m1();
		//c.m3();
		//System.out.println(c.x);
		
		A obj = new C();//parent class reference variable holding the child class object, when 
		obj.m1();
		//so using the above property 
		
		
	}

}
