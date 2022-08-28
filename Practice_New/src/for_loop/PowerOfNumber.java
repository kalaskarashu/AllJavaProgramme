package for_loop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		System.out.println("Enter the Power");
		int m=sc.nextInt();
		int sum=1;
		for(int i=1; i<=m;i++)
		{
			sum=sum*num;
		}
		System.out.println("Power of Number is:"+sum);

	}

}
