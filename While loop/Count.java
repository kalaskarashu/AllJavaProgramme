import java.util.Scanner;
class Count
{
	public static void main (String arg[])
	{
		int x,cnt=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		x=sc.nextInt();
		while(x !=0)
		{
			x=x/10;
			cnt++;
		}
		System.out.print(cnt);
	}
}