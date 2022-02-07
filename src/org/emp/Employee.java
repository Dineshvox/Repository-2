package org.emp;

public class Employee {
	private void empId() {
    System.out.println("923585");
	} 
	private void empName() {
    System.out.println("Dinesh");
	}
	private void empPhone() {
	System.out.println("9688321822");
	}
	private void empEmail() {
	System.out.println("dinesh@gmail.com");
	}
    private void empAddress() {
    System.out.println("P.N.Palayam");

	}
    public static void main(String[] args) {
		Employee ft =new Employee();
		ft.empId();
		ft.empName();
		ft.empPhone();
		ft.empEmail();
		ft.empAddress();
		
    }
}