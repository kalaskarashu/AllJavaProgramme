import java.util.*;
class Reverse
{
	public static void main (String arg[])
	{
		int n,sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int m=n;
		while (n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;

		}
		System.out.print("Reverse of number is ");
		System.out.println(sum);
		if(m==sum)
			System.out.println("Number plaindrome");

		
	}
}