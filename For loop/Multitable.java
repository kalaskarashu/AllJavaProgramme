import java.util.Scanner;
class Multitable
{
	public static void main(String arg[])
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		for (int i=1; i<=10; i++)
		{
			sum=num*i;
			System.out.println(sum);
		}
	}
}