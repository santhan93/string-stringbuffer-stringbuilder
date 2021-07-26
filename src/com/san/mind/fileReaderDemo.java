package com.san.mind;
import java.io.*;
public class fileReaderDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("C://Santhan//Temenos DOcs","FEDWIRE.SEAT.WRITE.ACCOUNT.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();
		while(i!= -1)
		{
			System.out.println(((char)i));
			i=fr.read();
		}
	}

}
