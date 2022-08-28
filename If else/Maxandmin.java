import java.util.Scanner;
class Maxandmin
{
	public static void main (String arg[])
	{
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the second number");
		num2=sc.nextInt();
		System.out.println("Enter the third number");
		num3=sc.nextInt();

		if(num1>num2 && num2>num3)
		{
			System.out.print("Maximum number is ");
			System.out.println(num1);
		}
		else if (num2>num3)
		{
			System.out.print("Maximum number is ");
			System.out.println(num2);
		}
		else 
		{
			System.out.print("Maximum number is ");
			System.out.println(num3);
		}
		if(num1<num2 && num2<num3)
		{
			System.out.print("Minimum number is ");
			System.out.println(num1);
		}
		else if (num2<num3)
		{
			System.out.print("Maximum number is ");
			System.out.println(num2);
		}
		else 
		{
			System.out.print("Maximum number is ");
			System.out.println(num3);
		}


	}
}