package for_loop;

import java.util.Scanner;

public class Pliandrome {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int t=num;
		int sum=0;
		int rem;
		for(int i=1; num!=0; i++)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==t)
		{
			System.out.println("Number is pliandrome");
		}
		else
		{
			System.out.println("Number is not Plaindrome");
		}
		
		
	}
}
