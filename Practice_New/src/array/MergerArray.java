package array;

import java.util.Scanner;

public class MergerArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	int a[]=new int[5];
	int b[]=new int[5];
	int c[]=new int[10];
	int i;
	System.out.println("Enter the Arrya for A");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the Arrya for B");
	for(i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
	for(i=0; i<a.length;i++)
	{
		c[i]=a[i];
	}
	for(int j=0; j<b.length;j++)
	{
		c[i]=b[j];
		i++;
	}
	for(i=0; i<c.length;i++)
	{
		System.out.print(c[i]);
	}
	

	}

}
