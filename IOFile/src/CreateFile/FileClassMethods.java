package CreateFile;

import java.io.File;
import java.io.IOException;

public class FileClassMethods {

	public static void main(String[] args) throws IOException 
	{
		File f1=new File("Hello.text");
		System.out.println("Is file "+f1.isFile());
		System.out.println("Path "+f1.getAbsolutePath());
		System.out.println("Execuatable "+f1.canExecute());
		System.out.println("Readable "+f1.canRead());
		System.out.println("Writable "+f1.canWrite());
		f1.delete();
		File f2=new File("Ash.java");
		f2.createNewFile();
		System.out.println("Exits "+f1.exists());

	}

}
