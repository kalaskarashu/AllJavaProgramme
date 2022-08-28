import java.util.Scanner;
class Basic
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int x=23;
		float y=23.56f;
		double z=45.655;
		char a='A';
		String name="Ashutosh";
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(name);
		System.out.println("Enter the name");
		char b=sc.next().charAt(0);
		System.out.println(b);
		sc.nextLine();//white space scanf(" %c",&a);
		String c=sc.nextLine();
		System.out.println(c);
		sc.nextInt();
		sc.nextDouble();
		sc.nextFlaot();



	}
}