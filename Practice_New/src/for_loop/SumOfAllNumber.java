package for_loop;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class SumOfAllNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ther number");
		int num=sc.nextInt();
		int sum = 0;
		int rem;
		for (int i = 0; num!=0; i++) 
		{
			rem = num % 10;
			sum = sum+ rem;
			num = num / 10;

		}
		System.out.println("Sum of Number is "+sum);
	}

}
