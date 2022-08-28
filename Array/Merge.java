import java.util.Scanner;
class Merge
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];
		int i,j;
		System.out.println("Enter the A Array");
		for (i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the B Array");
		for (j=0; j<b.length; j++)
		{
			b[j]=sc.nextInt();
		}
		for(i=0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		for (j=0; j<b.length; j++)
		{
			c[i]=b[j];
			i++;
		}
		for(i=0; i<c.length;i++)
		{
			System.out.print(" "+c[i]);
		}
	}
}