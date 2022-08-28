package com.vector;

import java.util.Vector;

public class Basic {

	public static void main(String[] args) {
		Vector list=new Vector();
		list.add("Ashutosh");
		list.add("chetan");
		list.add(11.23);
		list.add(true);
		list.add('M');
		list.addElement("Elemnt");
		System.out.println(list);
		Vector<String> list2=new Vector<String>();
		list2.add("Abhay");
		list2.add("Piyush");
		list2.add("tejas");
		list2.add("Abhu");
		list2.add("paa");
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);
		System.out.println("Is contains:"+list.contains("paa"));
		list.remove("paa");
		System.out.println(list);
		

	}

}
