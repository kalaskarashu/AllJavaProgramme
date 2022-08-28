package p1;
import java.util.Scanner;
class Addition
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{11,22,33,44,55};
		int i,res=0;
		for (i=0;i<arr.length;i++)
		{
			res=res+arr[i];
		}
		for (i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println(res);

	}
}