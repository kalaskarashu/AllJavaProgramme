import java.util.Scanner;
class Addition
{
	public static void main (String a [])
	{
		float x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		x=sc.nextFloat();
		System.out.println("Enter the second number");
		y=sc.nextFloat();
		float res=x+y;
		System.out.print("Addition is ");
		System.out.println(res);
		float res1=x-y;
		float res2=x*y;
		float res3=x/y;
		System.out.print("Subtraction is ");
		System.out.println(res1);
		System.out.print("Multipication is ");
		System.out.println(res2);
		System.out.print("Division is ");
		System.out.println(res3);


	}
}