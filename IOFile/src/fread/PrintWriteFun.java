package fread;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteFun {

	public static void main(String[] args) throws IOException
	{
		FileWriter f1=new FileWriter("Hello.txt",true);
		PrintWriter pw=new PrintWriter(f1);
		pw.println("ashutosh Kalaskar");
		pw.println(1234);
		char arr[]= {'A','b','C','D','E','t'};
		pw.println(arr);
		pw.flush();
		pw.close();
		}
		
	}


