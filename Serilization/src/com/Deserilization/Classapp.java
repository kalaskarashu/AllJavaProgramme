package com.Deserilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.Serilization.Student;

public class Classapp {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fin=new FileInputStream("Hello.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Student student=(Student)in.readObject();
		System.out.println("Id:"+student.getRollno());
		System.out.println("Name:"+student.getName());
		System.out.println("Marks:"+student.getMarks());

	}

}
