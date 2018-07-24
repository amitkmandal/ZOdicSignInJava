package com.shiftedtech.zodic;

public class Zodic {
	
	public String getSign(String month, int day) {
		String zodicSign = "";
		
		if((month.equalsIgnoreCase("march") && day >= 21 && day <=31) || (month.equalsIgnoreCase("april") && day <= 19)) {
			zodicSign = "Aries";
		}else if((month.equalsIgnoreCase("april") && day >= 20 && day <= 30) || (month.equalsIgnoreCase("may") && day <= 20)) {
			zodicSign = "Taurus";
		}else if((month.equalsIgnoreCase("may") && day >= 21 && day <= 31) || (month.equalsIgnoreCase("june") && day <= 20)) {
			zodicSign = "Gemini";
		}else if((month.equalsIgnoreCase("june") && day >= 21 && day <= 30) || (month.equalsIgnoreCase("july") && day <= 22)) {
			zodicSign = "Cancer";
		}else if((month.equalsIgnoreCase("july") && day >= 23 && day <= 31) || (month.equalsIgnoreCase("august") && day <= 22)) {
			zodicSign = "Leo";
		}else if((month.equalsIgnoreCase("august") && day >= 23 && day <= 31) || (month.equalsIgnoreCase("september") && day <= 22)) {
			zodicSign = "Virgo";
		}else if((month.equalsIgnoreCase("september") && day >= 23 && day <= 30) || (month.equalsIgnoreCase("october") && day <= 22)) {
			zodicSign = "Libra";
		}else if((month.equalsIgnoreCase("october") && day >= 23 && day <= 31) || (month.equalsIgnoreCase("november") && day <= 21)) {
			zodicSign = "Scorpio";
		}else if((month.equalsIgnoreCase("november") && day >= 22 && day <= 30) || (month.equalsIgnoreCase("december") && day <= 21)) {
			zodicSign = "Sagittarius";
		}else if((month.equalsIgnoreCase("december") && day >= 22 && day <= 31) || (month.equalsIgnoreCase("january") && day <= 19)) {
			zodicSign = "Capricorn";
		}else if((month.equalsIgnoreCase("january") && day >= 20 && day <= 31) || (month.equalsIgnoreCase("february") && day <= 18)) {
			zodicSign = "Aquarius";
		}else if((month.equalsIgnoreCase("february") && day >= 19 && day <= 29) || (month.equalsIgnoreCase("march") && day <= 20)) {
			zodicSign = "Pisces";
		}
		return zodicSign;
	}
	public static void main(String[] args) {
		Zodic zodic = new Zodic();
		String myAstroSign = zodic.getSign("SEPTEMBER", 15);
		System.out.println("According to Date of Birth Zodic Sign is : " + myAstroSign);
		System.out.println(zodic.getSign("january", 32));
	}

}
