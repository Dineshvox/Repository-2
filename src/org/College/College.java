package org.College;

public class College {
	 private void collegeName() {
		// TODO Auto-generated method stub
		 System.out.println("College name is Prince");
	}
    public void collegeCode() {
		// TODO Auto-generated method stub
    	System.out.println("College code is 4117");
	} public void collegeRank() {
		// TODO Auto-generated method stub
		System.out.println("7th Rank");
	}
    public static void main(String[] args)
    {
	College cl = new College();
	cl.collegeCode();
	cl.collegeName();
	cl.collegeRank();
	
	Student st = new Student();
	st.studentName();
	st.studentDepa();
	st.studentId();
	
	Hostel ho = new Hostel();
	ho.hostelName();
	
	Depa de = new Depa();
	de.depaName();
	}
}
