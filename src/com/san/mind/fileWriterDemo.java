package com.san.mind;
import java.io.*;
public class fileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("writer2.txt",true);//if true is given then overriding of data will not happen rather new data gets appended
		char[] ch = {'s','a','n','t','h','a','n'};
		fw.write(100);
		fw.write("\n");
		fw.write("I am New writer file");
		fw.write("\n");//'\n' is not working for printing in next line
		fw.write(ch);
		fw.flush();
		fw.close();

	}

}
