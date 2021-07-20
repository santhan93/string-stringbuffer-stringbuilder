package com.san.mind;

public class multipleStringMethods {

	public static void main(String[] args) {
		double a = 999.99;
		String s1 = "miltiple method STRINGS with multiple.";
		String s2 = s1.toUpperCase();//*This converts all the letters to upper case in a string*//
		String s3 = s1.toLowerCase();//*This converts all the letters to lower case in a string*//
		String s4 = s1.substring(8,16).trim();//*This creates a substring of s1 and trims the trailing and leading spaces*//
		String s5 = new String("my object");
		String s6 = s5.intern();
		String s7 = String.valueOf(a);
		System.out.println("uppercase: "+s2);
		System.out.println("Lowecase: "+s3);
		System.out.println("Trimmed substring :"+s4);
		System.out.println(s1.startsWith("milti"));
		System.out.println(s1.endsWith("ple."));
		System.out.println(s1.charAt(7));
		System.out.println(s1.length());//*length of the string is getting returned*//
		System.out.println(s1.replace("miltiple", "multiple"));
		System.out.println(s6+" "+10+s7);//* here 10 and s7 is not getting summed rather they are concatenated*//
	}

}
