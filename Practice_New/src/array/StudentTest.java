package array;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student stud[]=new Student[5];
		int iid;String iname;double imarks;
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter the Id");
			iid=sc.nextInt();
			stud[i].setId(iid);
			System.out.println("Enter the Name");
			sc.nextLine();
			iname=sc.nextLine();
			stud[i].setName(iname);
			System.out.println("Enter the Marks");
			imarks=sc.nextDouble();
			stud[i].setMarks(imarks);
			
		}
		for(int i=0;i<stud.length;i++)
		{
			System.out.println(stud[i].getId()+stud[i].getName()+stud[i].getMarks());
		}
		

	}

}
