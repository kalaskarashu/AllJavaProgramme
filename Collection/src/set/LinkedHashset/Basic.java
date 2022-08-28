package set.LinkedHashset;

import java.util.LinkedHashSet;

public class Basic {

	public static void main(String[] args) {
		LinkedHashSet<String> list=new LinkedHashSet<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		LinkedHashSet<String> list2=new LinkedHashSet<String>();
		list2.add("C");
		list2.add("D");
		list2.add("E");
		list2.add("F");
		System.out.println(list);
		System.out.println(list2);
		list.retainAll(list2);
		System.out.println(list);
	}

}
