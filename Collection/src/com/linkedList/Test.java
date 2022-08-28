package com.linkedList;

import java.util.LinkedList;

import moderate.Student;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student(21,"Sheth",78.90);
		Student s2=new Student(22,"Amrut",67.56);
		Student s3=new Student(23,"Vector",78.89);
		Student s4=new Student(24,"Shree",90.92);
		Student s5=new Student(25,"Jay",56.78);
		LinkedList<Student> list=new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println("By using for loop");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("By using for each looop");
		for(Student s:list)
			System.out.println(s);

	}

}
