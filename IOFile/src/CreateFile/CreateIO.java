package CreateFile;

import java.io.File;
import java.io.IOException;

public class CreateIO {

	public static void main(String[] args) throws IOException
	{
		File file=new File("H:/Webdelopment/JAVA programing/IOFile/Hello.text");
		file.createNewFile();
		System.out.println("File Creates sucessfully");
		File f1=new File("Ashutosh");
		f1.mkdir();
	//Folder and file inside
		File f2=new File("H:/");
		int cnt=0;
		String filesAndFolder[]=f2.list();
		for(int i=0; i<filesAndFolder.length;i++)
		{
			File f=new File(f2,filesAndFolder[i]);
			if(f.isDirectory()) 
			{
				System.out.println(filesAndFolder[i]);
				cnt++;
			}
			
		}
		System.out.println("Count "+cnt);
		//System.out.println("Count of Directory"+cnt2);
		

	}

}
