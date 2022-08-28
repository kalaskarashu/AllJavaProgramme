package p1;
class A
{
	String name;
	int age;
	A(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}

}
class B extends A
{
	String school;
	double marks;
	B(String school,double marks,String name,int age)
	{
		super(name,age);
		this.school=school;
		this.marks=marks;
	}
	public String getSchool()
	{
		return this.school;
	}
		public String toString()
	{
		return "Name:"+name+" Age:"+age+" School"+this.school+" Marks"+marks;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		A a1=new A("Ashutosh",24);
		System.out.println(a1.getName());
		B b1=new B("Aided",55.66,a1.getName(),a1.getAge());
		System.out.println(b1.getSchool());
		System.out.println(b1.toString());
	}
}