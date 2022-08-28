package com.linkedList;

import java.util.LinkedList;

public class ToArrayTest {

	public static void main(String[] args) {
		LinkedList<String> oxford=new LinkedList<String>();
		oxford.add("A");
		oxford.add("B");
		oxford.add("C");
		oxford.add("D");
		oxford.add("E");
		oxford.add("F");
		
		Object ob[]=oxford.toArray();
		for(int i=0;i<ob.length;i++)
		{
			System.out.print(","+ob[i]);
		}
		System.out.println("_____________________________________________________________________");
		String arr[]=new String[oxford.size()];
		arr=oxford.toArray(arr);
		for(int i=0; i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
