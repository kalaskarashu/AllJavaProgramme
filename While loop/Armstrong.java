import java.util.Scanner;
class Armstrong
{
	public static void main(String a[])
	{
		int n,t,r,c,sum=0,cnt=1,m;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		t=n;
		while(cnt<=n)
		{
			m=cnt;
			sum=0;
		
		while (m!=0)	
		{
			r=m%10;
			c=r*r*r;
			sum=sum+c;
			m=m/10;
		}
		if(cnt==sum)
		{
			System.out.println(cnt);
		}
		cnt++;
		}
	}
}