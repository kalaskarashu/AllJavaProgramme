import java.util.Scanner;
class Evenodd
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enterr the number ");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.print("Number is even");
		}
		else 
		{
			System.out.print("number is odd");
		}
	}
}