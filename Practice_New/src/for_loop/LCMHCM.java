package for_loop;

import java.util.Scanner;

public class LCMHCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther Two Number");
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int g=0;
		for(int i=2; i<=y;i++)
		{
			if(x%i==0 && y%i==0)
			{
				g=i;
			}
		}
		System.out.println("GCD is:"+g);
		int lcm=0;
		lcm=x*y/g;
		System.out.println("LCM is:"+lcm);
	}


}
