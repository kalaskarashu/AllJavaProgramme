package com.Serilization;

import java.io.*;

public class PersonTest
{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//	Person p1=new Person("Ashutosh",11,"Buldhana");
//	FileOutputStream fout=new FileOutputStream("H:/Webdelopment/JAVA programing/Serilization/Ashutosh/per.txt");
//	ObjectOutputStream out=new ObjectOutputStream(fout);
//	out.writeObject(p1);
//	out.flush();
//	out.close();
//	System.out.println("Succeded");
	FileInputStream fin=new FileInputStream("H:/Webdelopment/JAVA programing/Serilization/Ashutosh/per.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	Person p1=(Person)in.readObject();
	System.out.println("Name "+p1.getName());
	System.out.println("Id "+p1.getId());
	System.out.println("City "+p1.getCity());
	
	
	}

}
 