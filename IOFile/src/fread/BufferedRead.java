package fread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {

	public static void main(String[] args) throws IOException {
		FileReader f1=new FileReader("H:/Webdelopment/JAVA programing/Basic.java");
		BufferedReader br=new BufferedReader(f1);
		String line=br.readLine();
		while(line !=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		

	}

}
