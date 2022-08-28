import java.util.Scanner;
class ReverseArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i,sto;
		System.out.println("Enter the array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<=arr.length/2;i++)
		{
			sto=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=sto;
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);

	}
}