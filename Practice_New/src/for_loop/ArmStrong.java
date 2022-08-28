package for_loop;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		int t=num;
		int rem;
		while(num !=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==t)
		{
			System.out.println("Number is ArmStrong");
		}
		else
		{
			System.out.println("Number is Not ArmStrong");
		}

	}

}
