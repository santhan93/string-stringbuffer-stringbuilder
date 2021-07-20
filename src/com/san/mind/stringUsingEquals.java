package com.san.mind;

public class stringUsingEquals {

	public static void main(String[] args) {
		
		String s1 = "Santhan";
		String s2 = "santhan";
		String s3 = "Santhan";
		String s4 = new String("SANTHAN");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s1));
		System.out.println(s3.compareToIgnoreCase(s4));
	}

}
