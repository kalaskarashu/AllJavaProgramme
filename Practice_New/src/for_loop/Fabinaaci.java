package for_loop;

import java.util.Scanner;

public class Fabinaaci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int a=0,b=1,c=1;
		for(int i=1; i<=num;i++)
		{
			c=a+b;
			System.out.print(a+",");
			a=b;
			b=c;
		}

	}

}
