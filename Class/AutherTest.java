import java.util.Scanner;
class Auther
{
	private String name;
	private String email;
	private char gender;
	Auther(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	void printAuther()
	{
		System.out.println("Name:"+name+" Email:"+email+" Gender:"+gender);
	}
	public String getName()
	{
		return this.name;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
}
class AutherTest
{
	public static void main(String args[])
	{
		//Auther a1=new Auther();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		//sc.nextLine();
		String x=sc.nextLine();
		System.out.println("Enter the email");
		//sc.nextLine();
		String y=sc.nextLine();
		System.out.println("Enter the gender");
		char z=sc.next().charAt(0);
		Auther a1=new Auther(x,y,z);
		Auther a2=new Auther(as,hu,k);
		a1.printAuther();
		System.out.println("--------------------------------------------");
		String x1=a1.getName();
		String y1=a1.getEmail();
		System.out.println(x1);
		System.out.println(y1);
		System.out.println("--------------------------------------------");
		System.out.println("Enter changed email");
		sc.nextLine();
		String y2=sc.nextLine();
		a1.setEmail(y2);
		a1.printAuther();





	}
}