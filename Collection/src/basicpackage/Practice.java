package basicpackage;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("b");
		list.add("c");
		list.add("d");
		String arr[]=new String[list.size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=list.get(i);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
