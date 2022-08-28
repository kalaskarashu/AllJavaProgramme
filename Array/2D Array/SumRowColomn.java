import java.util.Scanner;
class SumRowColomn
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int i,j,res=0,res1=0,res2=0;
		System.out.println("Enter the array");
		/*for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}*/
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				res=res+a[i][j];
			}
		}
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);

	}
}

