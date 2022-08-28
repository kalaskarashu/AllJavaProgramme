package com.stringbuilder;

public class stringBuilder {


	public static void main(String[] args) 
	{
		String st=new String("Chetan");
		String ne=st.concat("Lipate");
		System.out.println(ne);
		StringBuilder stb=new StringBuilder(st);
		System.out.println(stb);
		stb.append(" Lipate");
		System.out.println(stb);
		StringBuffer sbr=new StringBuffer("Mom");
		sbr.append(" takes care");
		System.out.println(sbr);
		
	StringBuilder sb=new StringBuilder("Ashutosh");
	sb.append("Kalsakar");
	System.out.println(sb);
	StringBuilder greet=new StringBuilder("Hello");
	for (int i = 0; i < 5; i++)
	{
		greet.append("Guys");
	}
	System.out.println(greet);
	StringBuilder sr=new StringBuilder();
    System.out.println("Capacity:"+sr.capacity());
    StringBuilder fruit=new StringBuilder();
    System.out.println("Capacity:"+fruit.capacity());
    fruit.append("Apple");
    System.out.println("Capacity:"+fruit.capacity());
    fruit.append("Mangoes Grapes Orange");
    System.out.println("Capacity:"+fruit.capacity());
    
    StringBuffer flower=new StringBuffer();
    System.out.println("Capacity of flower:"+flower.capacity());
    flower.append("mogra");
    System.out.println("Capacity of flower:"+flower.capacity());
    flower.append("assdgh assjgfi vbn");
    System.out.println("Capacity of flower:"+flower.capacity());
	}


}
