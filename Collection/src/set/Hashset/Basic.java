package set.Hashset;

import java.util.HashSet;

public class Basic {

	public static void main(String[] args) {
		HashSet<String> list=new HashSet<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		HashSet<String> list2=new HashSet<String>();
		list2.add("C");
		list2.add("D");
		list2.add("E");
		list2.add("F");
		//list.retainAll(list2);
		String arr[]=new String[list.size()];
		 arr=list.toArray(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		

	}

}
