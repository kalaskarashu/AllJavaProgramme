class Person
{
	private String name;
	private int age;
	Person(String name)
	{
		this.name=name;
	}
	void printPerson()
	{
		System.out.println("Name:"+name+" Age:"+age);
	}
	void growOlder()
	{
		this.age=this.age+1;
	}
	int returnAge()
	{
		return this.age;
	}
	boolean isOfAgeLegal()
	{
		if(this.age>=18)
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
}
class PersonTest 
{
	public static void main (String args[])
	{
		Person p1=new Person("Ashutosh");
		p1.printPerson();
		p1.growOlder();
		System.out.println("Age:"+p1.returnAge());
		for (int i=0; i<20; i++)
		{
			p1.growOlder();
			System.out.println("Age:"+p1.returnAge());
			System.out.println(p1.isOfAgeLegal());
		}
	// legal=p1.isOfAgeLegal();
		

	}
}