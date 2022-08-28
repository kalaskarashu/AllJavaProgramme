import java.util.Scanner;
class CountEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int i,j;
		System.out.println("Enter the array");
		for(i=0;i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even number is "+a[i]);
			}
			else 
			{
				System.out.println("Odd number is "+a[i]);
			}
		}	
	}
}