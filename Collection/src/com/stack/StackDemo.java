package com.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> str=new Stack<String>();
		str.push("Ashutosh");
		str.push("chetana");
		str.push("abhaya");
		str.push("nirmal");
		str.push("vimal");
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}
		str.pop(); // pop last element remove;
		System.out.println(str);
		System.out.println("Get position "+str.search("Ashutosh"));
		System.out.println("Get position "+str.search("vimal"));
		System.out.println(str.peek()); // last element peek;
		

	}

}
