package org.add;

public class GreensTech {
private void greensOmr(int plotno,String street,String area,long pincode) {
	// TODO Auto-generated method stub
System.out.println("Greens Technolgy Omr Address"+"\n"+"plot no"+"\t"+plotno+"\n"+"Street"+"\t"+street+"\n"+"Area"+"\t"+area
		+"\n"+"pincode"+"\t"+pincode);
}	
public static void main(String[] args) {
	GreensTech om=new GreensTech();
	om.greensOmr(17, "ICICI Bank", "Thoraipakkam", 600097l);
}
}
