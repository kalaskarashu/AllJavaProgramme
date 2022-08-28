import java.util.Scanner;

class Userinput
{
	public static void main (String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1=sc.nextInt();
		System.out.println("Enter the number2");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println(res);
		char alpha;
		System.out.println("Enter the char");
		alpha=sc.next().charAt(0);
		System.out.println(alpha);
		String fi;
		System.out.println("Enter the full name");
		sc.nextLine();
		fi=sc.nextLine();
		System.out.println(fi);
		float x;
		System.out.println("Enter the float");
		x=sc.nextFloat();
		System.out.println(x);
	}
}