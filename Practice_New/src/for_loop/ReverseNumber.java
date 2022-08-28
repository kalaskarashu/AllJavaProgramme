package for_loop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther Number");
		int num=sc.nextInt();
		int sum=0;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse of numbeer is "+sum);

	}

}
