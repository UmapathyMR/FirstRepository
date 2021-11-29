package com.iciciloan.carloans;

public class Hdfc implements Rbi
{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hdfc i = new Hdfc();
		i.withdrawl();
		i.deposit();
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("I am overriden withdrawl in Hdfc");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("I am overriden deposit in Hdfc");
	}

}
