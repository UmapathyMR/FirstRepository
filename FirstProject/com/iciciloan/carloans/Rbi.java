package com.iciciloan.carloans;

public interface Rbi {
	
	int x = 100;
	
	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) {
		//we cannot create object inside the main method inside the interface..
	
		
		Rbi i;
		 i = new Icici();
		 i.withdrawl();
		 i.deposit();
		 
		 i = new Hdfc();
		 i.withdrawl();
		 i.deposit();
	
	}
	
	
	

}
