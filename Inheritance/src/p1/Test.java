package p1;
class person
{
	private int age;
	private String name;
	person()
	{
		age=18;
		name="Ashutosh";
	}
	person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	void Printdetails()
	{
		System.out.println("Age: "+age+" Name:"+name);
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
}
class account extends person
{
	private double balance;
	account()
	{
		balance=568.98;
	}
	account(int age,String name,double balance)
	{
		super(age,name);
		this.balance=balance;
	}
	void Printalldetails()
	{
		System.out.println("Name:"+super.getName()+" Age:"+super.getAge()+" Balance="+balance);
	}
}
class Test
{
	public static void main(String[] args) 
	{
		person p1=new person();
		person p2=new person(19,"Abhay");
		account a1=new account();
		int x=p2.getAge();
		String y=p2.getName();
		account a2=new account(x,y,60004.67);
		p1.Printdetails();
		p2.Printdetails();
		a1.Printalldetails();
		a2.Printalldetails();

	}
}