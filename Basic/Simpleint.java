import java.util.Scanner;
class Simpleint
{
	public static void main (String a [])
	{
		float p,r,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle");
		p=sc.nextFloat();
		System.out.println("Enter the Rate");
		r=sc.nextFloat();
		System.out.println("Enter the time in year");
		t=sc.nextFloat();
		float res=(p*r*t)/100;
		System.out.print("simple interset is ");
		System.out.println(res);
	}
}
