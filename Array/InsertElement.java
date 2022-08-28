import java.util.Scanner;
class InsertElement
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i,ele,loc;
		System.out.println("Enter the array");
		for(i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element");
		ele=sc.nextInt();
		System.out.println("Enter the Location");
		loc=sc.nextInt();
		for(i=arr.length-1; i>=loc; i--)
		{
			arr[i+1]=arr[i];
		}
		arr[loc]=ele;
		for(i=0; i<arr.length+1;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}