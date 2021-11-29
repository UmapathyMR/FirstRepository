package com.iciciloan.carloans;

public class B extends A //ISA relationship

{

	public void m2() {
		
		System.out.println("I am m2 from B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ISA relationship, using this relationship, we can call only the parent method from the child class and 
		//we cannot call the child method, because it is a ISA relationship...very important
		A a = new A();
		a.m1();
		System.out.println(a.x);
		
		
		//ISA relationship, using this relationship, we can call both the parent method and child method
		//from the child class as below...
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
	}
	

}
