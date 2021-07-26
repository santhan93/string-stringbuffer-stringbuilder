package com.san.mind;
import java.io.*;
public class fileBufferWriterDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("C://Santhan//Temenos DOcs","FEDWIRE.SON.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am good boy");
		bw.newLine();
		char[] ch = {'S','A','N','T'};
		bw.write(ch);
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
