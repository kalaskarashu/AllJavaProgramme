import java.util.Scanner;
class Power
{
	public static void main(String arg[])
	{
		int x,y,sum=1,choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter the number");
			x=sc.nextInt();
			System.out.println("Enter the power");
			y=sc.nextInt();

			for(int i=1; i<=y; i++)
			{
				sum=sum*x;
			}
			System.out.print("Pwer is ");
			System.out.println(sum);
			System.out.println("Do you want to continue");
			choice=sc.nextInt();
		}
		while (choice==1);
	}
}