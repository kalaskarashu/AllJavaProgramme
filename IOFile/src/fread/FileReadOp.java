package fread;

import java.io.FileReader;
import java.io.IOException;

public class FileReadOp {

	public static void main(String[] args) throws IOException 
	{
		FileReader f1=new FileReader("H:/Webdelopment/JAVA programing/Basic.java");
		int val=f1.read();
		while(val !=-1)
		{
			System.out.print((char)val);
			val=f1.read();
		}
		f1.close();

	}

}
