import java.util.Scanner;
class Factorial
{
	public static void main (String arg [])
	{
		int n,cnt=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		while (n !=0)
		{
				cnt=cnt*n;
				n--;
		}
		System.out.print("Factorial of number is ");
		System.out.println(cnt);
	}
}