import java.util.Scanner;
class Assignment1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i,sum=0;
		for(i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(i=0; i<arr.length;i++)
		{
			sum=sum+arr[i];
			System.out.print(+sum+",");

		}

	}
}