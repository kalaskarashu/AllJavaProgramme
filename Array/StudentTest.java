import java.util.Scanner;
class Student
{
	int no;
	String name;
	double marks;
	Student(int no,String name,double marks)
	{
		this.no=no;
		this.name=name;
		this.marks=marks;
	}
}
class StudentTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student stud[]=new Student[2];
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter the roll no");
			int x=sc.nextInt();
			System.out.println("Enter the name");
			sc.nextLine();
			String y=sc.nextLine();
			System.out.println("Enter the marks");
			double z=sc.nextDouble();
			stud[i]=new Student(x,y,z);
		}
		for(int i=0; i<stud.length;i++)
		{
			System.out.print("Roll:"+stud[i].no+" Name:"+stud[i].name+" Marks:"+stud[i].marks);
			System.out.println();
		}
	}
}