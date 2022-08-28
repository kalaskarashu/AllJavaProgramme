package com.linkedList;

import java.util.LinkedList;

public class CompareObj {

	public static void main(String[] args) {
		Student s1=new Student(11,"Ashutosh",78.99);
		Student s2=new Student(12,"Abhay",48.99);
		Student s3=new Student(13,"Chetan",88.99);
		Student s4=new Student(14,"Bhika",98.99);
		Student s5=new Student(15,"Pittya",67.99);
		
		LinkedList<Student> st=new LinkedList<Student>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s4);
		Student s=new Student(14,"Bhika",98.99);
		System.out.println(" Contains "+st.contains(s));

	}

}
