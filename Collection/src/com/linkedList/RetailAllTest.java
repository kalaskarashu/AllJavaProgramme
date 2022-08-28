package com.linkedList;

import java.util.LinkedList;

public class RetailAllTest {

	public static void main(String[] args) {
		LinkedList<String> oxford=new LinkedList<String>();
		oxford.add("A");
		oxford.add("B");
		oxford.add("C");
		oxford.add("D");
		oxford.add("E");
		oxford.add("F");
		LinkedList<String> cambridge=new LinkedList<String>();
		cambridge.add("E");
		cambridge.add("F");
		cambridge.add("Z");
		cambridge.add("g");
		cambridge.add("h");
		System.out.println(oxford);
		oxford.retainAll(cambridge);
		System.out.println(oxford);
		

	}

}
