package for_loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sum=1;
		for(int i=1; i<=num; i++)
		{
			sum=sum*i;
		}
		System.out.println("Factorial if Number is:"+sum);
		
		

	}

}
