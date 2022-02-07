package org.tcs.test.flipkart.login;
import org.cts.test.flipkart.login.*;
//import org.cts.test.flipkart.login.Company;
//import org.cts.test.flipkart.login.Employee;
public class Client {
private void clientName() {
	// TODO Auto-generated method stub
System.out.println("client name is crox");
}
private void clientId() {
	// TODO Auto-generated method stub
	System.out.println("client id is 43434");
}
public static void main(String[] args) {
	Client c = new Client();
	c.clientId();
	c.clientName();
	
	Company co=new Company();
	co.comId();
	co.comName();
	
	Employee em = new Employee();
	em.empId();
	em.empName();
}
}
