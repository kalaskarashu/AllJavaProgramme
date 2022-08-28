package array;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sto[]=new int[5];
		int res=0;
		System.out.println("Enter the Array");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length;i++)
		{
			
			res=res+arr[i];
			System.out.print(res+",");
		}
		System.out.println();
		for(int i=0; i<arr.length;i++)
		{
			sto[i]=sto[i]+arr[i];
			System.out.print(sto[i]+",");
		}
		
		

	}

}
