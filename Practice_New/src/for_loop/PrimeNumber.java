package for_loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int cnt=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				 cnt++;
			}
		}
		if(cnt==2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}

	}

}
