import java.util.Scanner;
class Student
{
		int rollno;
		String name;
		double marks;
		private String gender;

	Student(int rollno,String name,Double marks,String gender)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		this.gender=gender;
	}
	int getRollno()
	{
		return rollno;
	}
	String getName()
	{
		return name;
	}
	Double getMarks()
	{
		return marks;
	}
	String getGender()
	{
		return gender;
	}

}
class StudentTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Roll no");
		int x=sc.nextInt();
		System.out.println("Enter the name");
		sc.nextLine();
		String y=sc.nextLine();
		System.out.println("Enter the marks");
		double z=sc.nextDouble();
		System.out.println("Enter the Gender");
		sc.nextLine();
		String y1=sc.nextLine();
		Student s1=new Student(x,y,z,y1);
		System.out.println("Roll no:"+s1.getRollno()+" || Name of student:"+s1.getName()+" || Percentage is:"+s1.getMarks()+" Gender is:"+s1.getGender());

	}
}