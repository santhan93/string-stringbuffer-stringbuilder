package com.san.mind;
import java.io.*;
public class fileCreationinSubdir {

	public static void main(String[] args) throws IOException {
		int count = 0;
		File f = new File("Dummy folder2");
		f.mkdir();
		if (f.isFile()) {
			System.out.println("This is a file doc");
		}
		else
			System.out.println("This is a Directory");
		String [] S5 = f.list();
		for (String S6 : S5) {
			count++;
			System.out.println(S6);
		}
		File f2 = new File(f,"ACH1.txt");//with file object reference
		f2.createNewFile();
		System.out.println(f2.exists());
		String s = f2.getAbsolutePath();
		System.out.println("File path is :- "+s);
		File f3 = new File("D://","ACH2.txt"); //With direct path
		f3.createNewFile();
		String s2 = f3.getAbsolutePath();
		System.out.println("File path is :- "+s2);
	}

}
