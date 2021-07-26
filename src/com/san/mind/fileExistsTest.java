package com.san.mind;
import java.io.*;
public class fileExistsTest {

	public static void main(String[] args) throws IOException {
		File f = new File("abcd.txt");
		File f2 = new File("Dummy files");
		f2.mkdir();
		System.out.println(f2.exists());
		String s2 = f2.getAbsolutePath();
		System.out.println("Directory path is: "+s2);
		System.out.println(f.exists());
		f.createNewFile();
		String s = f.getAbsolutePath();
		System.out.println("File path is: "+s);
		System.out.println(f.exists());

	}

}
