package moderate;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) 
	{
		Student s1=new Student(11,"Ashutosh",78.99);
		Student s2=new Student(12,"Abhay",48.99);
		Student s3=new Student(13,"Chetan",88.99);
		Student s4=new Student(14,"Bhika",98.99);
		Student s5=new Student(15,"Pittya",67.99);
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println(list);
		System.out.println("By using for loop");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println("By using for each loop");
		for(Student s:list)
			System.out.println(s);
	}
	

}
