import java.util.Scanner;
class GridAccount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		int i,j,sum=0,sum1=0,sum2=0;
		System.out.println("Enter for 1 Customer");

		for(i=0; i<arr.length;i++)
			{
				for(j=0; j<arr[i].length;j++)
				{
					arr[i][j]=sc.nextInt();
				}
				System.out.println("Enter for Customer");
			}
		for(i=0; i<arr.length;i++)
		{
			for(j=0; j<arr[i].length;j++)
			{
					System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		for(i=0; i<arr.length;i++)
		{
			for(j=0; j<arr[i].length;j++)
			{
					if(i==0 && j==0 || j==2 && i==0 || i==0 && j==1)
					{
						sum=sum+arr[i][j];
					}
			}
			
		}
		System.out.println("Customer 1 wealth is "+sum);
		for(i=0; i<arr.length;i++)
		{
			for(j=0; j<arr[i].length;j++)
			{
					if(i==1 && j==0 || j==1 && i==1 || i==1 && j==2)
					{
						sum1=sum1+arr[i][j];
					}
			}
			
		}
		System.out.println("Customer 2 wealth is "+sum1);
		for(i=0; i<arr.length;i++)
		{
			for(j=0; j<arr[i].length;j++)
			{
					if(i==2 && j==0 || j==1 && i==2 || i==2 && j==2)
					{
						sum2=sum2+arr[i][j];
					}
			}
			
		}
		System.out.println("Customer 3 wealth is "+sum2);
		if(sum>sum1 && sum1>sum2)
		{
			System.out.println("Customer 1 wealth is Strong "+sum);
		}
		else if(sum1>sum2)
		{
			System.out.println("Customer 2 wealth is Strong "+sum1);
		}
		else
		{
			System.out.println("Customer 3 wealth is Strong "+sum2);

		}
	}
}