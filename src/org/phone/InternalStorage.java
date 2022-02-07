package org.phone;

public class InternalStorage {
	private void processorName() {
		// TODO Auto-generated method stub
		System.out.println("712 snapdragon");
	}
 private void ramSize() {
	System.out.println("6GB Ram");
	 
}
 public static void main(String[] args) {
	InternalStorage ist   =new InternalStorage();
	
	ist.processorName();
	ist.ramSize();
	
	
    ExternalStorage est = new ExternalStorage();
    est.size();
}
}
