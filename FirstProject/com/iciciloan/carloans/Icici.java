package com.iciciloan.carloans;

public class Icici implements Rbi

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Icici i = new Icici();
		i.withdrawl();
		i.deposit();
		
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("I am overriden withdrawl in ICICI");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("I am overriden deposit in ICICI");		
	}

}
