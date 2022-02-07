package org.company;

public class CompanyInfo {
	private void companyName(String comp,String name,String name2) {
		// TODO Auto-generated method stub
		System.out.println("Company Inforemation"+"\n"+"Company list"+"\n"+"name0"+"\t"+comp+"\n"+"Name 1"+"\t"+name+"\n"+" Name 2"+"\t"+name2);
	}
	public static void main(String[] args) {
		CompanyInfo ci=new CompanyInfo();
		ci.companyName("INFOTECH", "CTS", "TCS");
	}

}
