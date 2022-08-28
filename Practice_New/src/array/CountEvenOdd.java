package array;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		int even=0,odd=0;
		int arr[]=new int[size];
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the Value for "+i);
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("");
		System.out.print("Even Number is:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
				System.out.print(arr[i]+",");
			}
			
		}
		System.out.println("");
		System.out.print("Odd Number is:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				odd++;
				System.out.print(arr[i]+",");
			}
			
		}
		System.out.println("");
		System.out.println("Count of Even is:"+even);
		System.out.println("Count of odd is:"+odd);

	}

}
