package com.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Basic {

	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.add("Ashutosh");
		list.add(23);
		list.add('A');
		System.out.println(list.contains('A'));
		System.out.println(list);
		LinkedList<String> stud=new LinkedList<String>();
		stud.add("Chetan");
		stud.add("Abhay");
		stud.add("Vishals");
		System.out.println(stud);
		list.addAll(stud);
		System.out.println(list);
		list.remove("Abhay");
		System.out.println(list);
		System.out.println("Collection size"+list.size());
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(11);
		li.add(22);
		li.add(33);
		li.add(44);
		li.add(55);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("First "+li.getFirst()); 
		System.out.println("last "+li.getLast()); 
		li.add(3, 999);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		ArrayList<Integer> ali=new ArrayList<Integer>(li);
		System.out.println(ali);
	}

}