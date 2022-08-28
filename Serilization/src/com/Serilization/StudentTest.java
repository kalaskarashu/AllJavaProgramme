package com.Serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentTest 
{

	public static void main(String[] args) throws IOException
	{
		Student s1=new Student(13,"Ashu",95.89);
		FileOutputStream fout=new FileOutputStream("Hello.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("Succed");

	}

}
