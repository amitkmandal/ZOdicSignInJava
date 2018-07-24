package com.shiftedtech.zodic;

public class ZodicSign {
	/*
	 * Aries (March-21 to April-19)
	 * Taurus (April-20 to May-20)
	 * Gemini (May-21 to June-20)
	 * Cancer (June-21 to July-22)
	 * Leo (July-23 to August-22)
	 * Virgo (August-23 to September-22)
	 * Libra (September-23 to October-22)
	 * Scorpio (October-23 to November-21)
	 * Sagittarius (November-22 to December-21)
	 * Capricorn (December-22 to January-19)
	 * Aquarius (January-20 to February-18)
	 * Pisces (February-19 to March-20)
	 */
	public String getZodic(int day, String month) {
		String astroSign = "";
		if(month.equalsIgnoreCase("december")) {
			if(day >=1 && day < 22) {
				astroSign = "Sagittarius";
			}
			else if (day >= 22 && day <= 31 )
				astroSign = "Capricorn";
		}else if(month.equalsIgnoreCase("january")) {
			if(day >= 1 && day < 20) {
				astroSign = "Capricorn";
			}
			else if (day >= 20 && day <= 31)
				astroSign = "Aquarius";
		}else if(month.equalsIgnoreCase("February")) {
			if(day >= 1 && day < 19) {
				astroSign = "Aquarius";
			}
			else if (day >= 19 && day < 29)
				astroSign = "Pisces";
		}else if(month.equalsIgnoreCase("March")) {
			if(day >= 1 && day < 21) {
				astroSign = "Pisces";
			}
			else if (day >= 21 && day <= 31)
				astroSign = "Aries";
		}else if(month.equalsIgnoreCase("April")) {
			if(day >= 1 && day < 20) {
				astroSign = "Aries";
			}
			else if (day >= 20 && day <= 30)
				astroSign = "Taurus";
		}else if(month.equalsIgnoreCase("May")) {
			if(day >=1 && day < 21) {
				astroSign = "Taurus";
			}
			else if (day >= 21 && day <= 31)
				astroSign = "Gemini";
		}else if(month.equalsIgnoreCase("June")) {
			if(day >=1 && day < 21) {
				astroSign = "Gemini";
			}
			else if (day >= 21 && day <= 30)
				astroSign = "Cancer";
		}else if(month.equalsIgnoreCase("July")) {
			if(day >= 1 && day < 23) {
				astroSign = "Cancer";
			}
			else if (day >= 23 && day <= 31)
				astroSign = "Leo";
		}else if(month.equalsIgnoreCase("August")) {
			if(day >= 1 && day < 23) {
				astroSign = "Leo";
			}
			else if (day >= 23 && day <= 31)
				astroSign = "Virgo";
		}else if(month.equalsIgnoreCase("September")) {
			if(day >= 1 && day < 23) {
				astroSign = "Vigro";
			}
			else if (day >= 23 && day <= 30)
				astroSign = "Libra";
		}else if(month.equalsIgnoreCase("October")) {
			if(day >= 1 && day < 23) {
				astroSign = "Libra";
			}
			else if (day >= 23 && day <= 31)
				astroSign = "Scorpio";
		}else if(month.equalsIgnoreCase("November")) {
			if(day >= 1 && day < 22) {
				astroSign = "Scorpio";
			}
			else if (day >= 22 && day <= 30)
				astroSign = "Sagittarius";
		}
		return astroSign;
	}
	public static void main(String[] args) {
		ZodicSign zd = new ZodicSign();
		String sign = zd.getZodic(30, "oCtOBEr");
		System.out.println("According to your Date of birth your ZodicSign is "+sign);
		System.out.println("According to your Date of birth your ZodicSign is "+ zd.getZodic(15,"SEPTEMBER"));
	}

}
