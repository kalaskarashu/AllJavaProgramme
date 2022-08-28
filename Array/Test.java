import java.util.Scanner;
class Test
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("ENter the number");
		size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}