class Student
{
	String name;
	int rollno;
	static String clgname;
	static int counter=0;
	Student(String name)
	{
		this.name=name;
		this.rollno=setRollno();
	}
	static int setRollno()
	{
		counter++;
		return counter;
	}
	static void setClgname(String name)
	{
		clgname=name;
	}
	void getStudentInfo()
    {
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollno);
  
        // accessing static variable
        System.out.println("cllgName : " + clgname);
    }


}
class Test
{
	public static void main(String[] args) 
	{
		Student.setClgname("Aided");
		Student s1=new Student("Ashutosh");
		Student s2=new Student("Abhay");
		s1.getStudentInfo();
		s2.getStudentInfo();
	}
}