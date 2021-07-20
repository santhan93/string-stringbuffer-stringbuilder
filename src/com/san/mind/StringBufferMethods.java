package com.san.mind;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Hello World");
		System.out.println(a.capacity());
		a.append(" i am Santhan");
		a.insert(20,"how are you?").replace(0, 5, "Hi..!!");
		a.delete(0, 2).reverse();
		System.out.println(a);
		System.out.println(a.capacity());

	}

}
