package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sto;
		for(int i=0;i<arr.length/2;i++)
		{
			sto=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=sto;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}

	}

}
