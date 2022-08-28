package array;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int a[]=new int[6];
		int k=0;
		int min=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(k<a[i])
			{
				k=a[i];
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("min is:"+min+" Max is:"+k);
		

	}

}
