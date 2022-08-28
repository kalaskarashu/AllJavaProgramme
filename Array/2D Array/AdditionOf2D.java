import java.util.Scanner;
class AdditionOf2D
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i,j;
		System.out.println("Enter the array for A");
		for(i=0; i<a.length;i++)
		{
			for(j=0; j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the array for B");
		for(i=0; i<b.length;i++)
		{
			for(j=0; j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}