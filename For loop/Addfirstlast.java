import java.util.Scanner;
class Addfirstlast
{
	public static void main (String arg[])
	{
		int num,temp,cnt=0,divide=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		temp=num;
		int temp2=num;
		for (int i=1; temp!=0; i++)
		{
			temp=temp/10;
			cnt++;
		}
		for (int i=1; i<cnt; i++)
		{
			divide=divide*10;
		}
		int first=temp2/divide;
		int rem=num%10;
		System.out.print("First number is ");
		System.out.println(first);
		System.out.print("LAst number is ");
		System.out.println(rem);
		int sum=first+rem;
		System.out.print("Addition is ");
		System.out.println(sum);
	}
}