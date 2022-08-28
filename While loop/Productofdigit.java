import java.util.Scanner;
class Productofdigit
{
	public static void main (String arg [])
	{
		int n,sum=1,r;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number ");
		n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			sum=sum*r;
			n=n/10;
		}
		System.out.print("Product of number is ");
		System.out.println(sum);
	}
}