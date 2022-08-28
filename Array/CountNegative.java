import java.util.Scanner;
class CountNegative
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int a[]=new int[5];
		System.out.println("Enter the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println("Element is "+a[i]);
				cnt++;
			}
		}
		System.out.println("COunt negative element is "+cnt);

	}
}