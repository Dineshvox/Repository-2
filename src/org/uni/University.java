package org.uni;

public class University extends College {
@Override
public void ug() {
	// TODO Auto-generated method stub
	System.out.println("ug565");
}
@Override
	public void pg() {
		// TODO Auto-generated method stub
		System.out.println("pg45456");
	}
public static void main(String[] args) {
	University un=new University();
	un.pg();
	un.ug();
}
}
