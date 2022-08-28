import java.util.Scanner;
class primenum
{
	public static void main (String arg[])
	{
		Scanner sc=new Scanner (System.in);
		int start=1;
		int end;
		System.out.println("Enter the number");
		end=sc.nextInt();
		while (start<=end)
		{
			System.out.println(start);
			start++;
		}
	}
}