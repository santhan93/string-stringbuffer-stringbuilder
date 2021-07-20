package com.san.mind;

public class StringBuilderMethods {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("Hello World");
		System.out.println(a.capacity());
		a.append(" i am Santhan");
		a.insert(20,"how are you?").replace(0, 5, "Hi..!!");
		a.delete(0, 2).reverse();
		System.out.println(a);
		System.out.println(a.capacity());

	}

}
