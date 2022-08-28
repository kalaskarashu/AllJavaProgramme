package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
	public static void main(String[] args) {
		LinkedList<String> oxford=new LinkedList<String>();
		oxford.add("A");
		oxford.add("B");
		oxford.add("C");
		oxford.add("D");
		oxford.add("E");
		oxford.add("F");
		Iterator<String> itr=oxford.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
