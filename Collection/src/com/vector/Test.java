package com.vector;

import java.util.Vector;

import moderate.Student;

public class Test {
public static void main(String[] args)
{
	Student s1=new Student(31,"Qwerty",87.67);
	Student s2=new Student(31,"Piyush",87.67);
	Student s3=new Student(31,"Boss",87.67);
	Student s4=new Student(31,"Hate",87.67);
	Student s5=new Student(31,"Love",87.67);
	Vector<Student> list=new Vector<Student>();
	list.add(s5);
	list.add(s4);
	list.add(s3);
	list.add(s2);
	list.add(s1);
	for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
}
}
