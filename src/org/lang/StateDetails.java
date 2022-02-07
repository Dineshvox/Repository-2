package org.lang;

public class StateDetails {
	private void southIndia() {
		// TODO Auto-generated method stub
		System.out.println("Tamil is  a one of the south india language");
	}
	private void northIndia() {
		// TODO Auto-generated method stub
		System.out.println("Hindi is a one of the north india language");
	} 
	public static void main(String[] args) {
		StateDetails sd =new StateDetails();
		sd.southIndia();
		sd.northIndia();
		
		LanguageInfo lan=new LanguageInfo();
		
		lan.tamilLanguage();
		lan.englishLanguage();
		lan.hindiLanguage();
	}

}
