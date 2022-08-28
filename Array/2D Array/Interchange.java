import java.util.Scanner;
class  Interchange
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter the array");
		int i,j,t=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
				t=a[i][j];
				a[i][j]=a[i][2-i];
				a[i][2-i]=t;
			    }
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}