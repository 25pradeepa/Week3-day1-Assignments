package org.bank;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("I have FD");
	}
	public static void main(String[] args)
	{
		AxisBank bk =new AxisBank();
		bk.deposit();
		
	}
}
