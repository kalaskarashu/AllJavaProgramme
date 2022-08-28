package fread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {

	public static void main(String[] args) throws IOException {
		FileWriter f1=new FileWriter("GYM.txt");
		BufferedWriter bw=new BufferedWriter(f1);
		bw.write(100);
		bw.newLine();
		bw.write("Ashutosh");
		bw.newLine();
		char arr[]= {'a','b','c'};
		bw.write(arr);
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
