package com.Serilization;

import java.io.Serializable;

public class Student implements Serializable   //implements is important for serilizable 
{
	int rollno;
	String name;
	double marks;
	public Student(int rollno, String name, double marks) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
}
