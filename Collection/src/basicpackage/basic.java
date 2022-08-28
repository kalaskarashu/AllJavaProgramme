package basicpackage;

import java.util.ArrayList;
import java.util.List;

public class basic {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ashutosh");
		list.add("Chetan");
		list.add("Abhay");
		list.add("ishan");
		list.add("Marks");
		list.add("Chetan");
		list.add("Chetan");
		list.add("Chetan");
	//	list.add(1);
		System.out.println(list);
		ArrayList list2=new ArrayList();
		list2.add(1);
		list2.add(1.2);
		list2.add('A');
		list2.add("Ashutosh");
		list2.add(true);
		list2.add(5.8f);
		System.out.println(list2);
		List list3=new ArrayList();
		list3.add("shrijit");
		System.out.println(list3);
		

	}

}
