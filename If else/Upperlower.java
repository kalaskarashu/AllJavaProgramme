import java.util.Scanner;
class Upperlower
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		char pi;
		System.out.println("Enter the chacter");
		pi=sc.next().charAt(0);
		if (pi>='A' && pi<='Z')
		{
			System.out.println("Capital case");
		}
		else if (pi>='a' && pi<='z')
		{
			System.out.println("Small case");
		}
	}
}