import java.util.Scanner;
class even
{
	public static void main(String arg[])
	{
		int start=1;
		int end,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		end=sc.nextInt();
		while (start<=end)
		{
			if(start%2==0)
			{
				System.out.println(start);
				sum=sum+start;
			}
			start++;
		}
		System.out.print("sum of all even number is ");
		System.out.println(sum);
	}

}