package com.string;

public class StringFunction {

	public static void main(String[] args) {
		String str="Ashutosh";
		System.out.println("After concat "+str.concat("Kalaskar"));
		String ybr="Hello";
		System.out.println("char AT "+ybr.charAt(4));
		String xml="Hello";
		System.out.println("Compare To "+ybr.compareTo(xml));
		System.out.println("Compare To "+ybr.compareTo(str));
		String prayer="i love india";
		System.out.println("i th index at start position "+prayer.indexOf('l'));
		System.out.println("i th index at start position "+prayer.indexOf('i'));
		System.out.println("Substring "+prayer.substring(2, 6));
		String pattern="Hello-bye-cool-done";
		String word[]=pattern.split("-");
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
			
		}
		System.out.println();
		String laptop="     Dell     ";
		System.out.println(laptop);
		System.out.println("After trim "+laptop.trim());
		String country="India is my country";
		System.out.println("Start with "+country.startsWith("India"));
		String remote="";
		System.out.println("IsEmpity "+remote.isEmpty());
		

	}

}
