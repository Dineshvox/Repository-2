package org.bank;

public class Stringg {
	public static void main(String[] args) {
		//ex=1
		String s="GreensTechnology";
		String s1="SeleniumAutomationtool";
		String s3="velmurugan";
		String s4="j a v a p r o g r a m";
		String s5="9095484678";
//		int l1 = s.length();
//		int l2 = s1.length();
//		int l3 = s3.length();
//		int l4 = s4.length();
//		int l5 = s5.length();
//		System.out.println("The Length of word given below"+"\n"+l1+"\n"+l2+"\n"+l3+"\n"+l4+"\n"+l5);
		//last index of 'o'=Actual length of 'o' is 14, but o/p printed value is 13,because rules is follow "length -1"=o/p Exc=2
		int lo = s.lastIndexOf('o');
		System.out.println(lo);
		int lo1 = s1.lastIndexOf('o');// o/p=20
		System.out.println(lo1);
		int lo2 = s3.lastIndexOf('g');//o/p 7
		System.out.println(lo2);
		int lo3 = s4.lastIndexOf(" ");//o/p 19
		System.out.println(lo3);
		int lo5 = s5.lastIndexOf('7');
		System.out.println(lo5);
		//Exc 3
	//.charAt('')
		
	}

}
