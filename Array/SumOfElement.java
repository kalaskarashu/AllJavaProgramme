import java.util.Scanner;
class Sum
{
	int b[]=new int[size];
	int add=0,i;
	Sum(int b[])
	{
		this.b=new int size
		for(i=0;i<b.length;i++)
		{
		this.b[i]=b[i];
		}
	}
	void PrintSum()
	{
		for(i=0;i<b.length;i++)
		{
			add=add+b[i];
		}
		System.out.println(add);
	}

}
class SumOfElement
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int i,sum=0;
		System.out.println("Enter the array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Sum s1=new Sum(a);
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of all Element:"+sum);
		s1.PrintSum();
		

	}
}