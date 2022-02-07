package org.bank;

public class AxisBank extends BankInfo{	
 
@Override
public void deposit(int amount) {
	// TODO Auto-generated method stub
	System.out.println("deposit amount is"+amount);
}
public static void main(String[] args) {
	AxisBank  ax = new AxisBank();
	ax.deposit(5675);
	
	
}
}
