package for_loop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}

	}

}
