import java.util.Scanner;
class Maharastra
{
	int a=36;
	String b="Mumbai";
	int c=112374333;
}
class Goa
{
	int a=2;
	String b="Panji";
	int c=1458545;
}
class Gujarat
{
	int a=33;
	String b="Gandhinagar";
	int c=60439692;
}
class CountryTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Country name");
		sc.nextLine();
		String x1=sc.nextLine();
		System.out.println("1=Maharastra,2=Goa,3=Gujarat");
		System.out.println("Enter the state No");
		//sc.nextLine();
		int x2=sc.nextInt();
		Maharastra m1=new Maharastra();
		Goa g1=new Goa();
		Gujarat g2=new Gujarat();
		if(x2==1)
		{
			System.out.println("District is:"+m1.a+" Capital of state:"+m1.b+" Population is:"+m1.c);
		}
		else if(x2==2)
		{
			System.out.println("District is:"+g1.a+" Capital of state:"+g1.b+" Population is:"+g1.c);
		}
		else if(x2==3)
		{
			System.out.println("District is:"+g2.a+" Capital of state:"+g2.b+" Population is:"+g2.c);
		}
		else 
		{
			System.out.println("Enter valid input");
		}



	}
}