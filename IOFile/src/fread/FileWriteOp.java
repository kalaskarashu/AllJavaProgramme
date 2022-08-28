package fread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOp {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("Friuts.txt");
		FileWriter f1=new FileWriter(f,true); // true key for add new paragraph old contain not erase
		f1.write(178);
		f1.write('\n');
		f1.write("Mpple");
		f1.write('\n');
		char arr[]= {'A','B','C','D'};
		f1.write(arr);
		f1.write('\n');
		f1.write('G');
		f1.write('\n');
		f1.flush();
		f1.close();
		

	}

}
