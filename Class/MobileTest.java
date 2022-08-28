import java.util.Scanner;
class Samsung
{
	int mn=256;
	String name="samsung";
	Double price=69000.49;
	double size=6.7;
}
class Nokia
{
	int mn=2366;
	String name="nokia";
	Double price=65345.49;
	double size=5.7;
}

class MobileTest
{
	public static void main(String args[])
	{
		Samsung s1=new Samsung();
		Nokia n1=new Nokia();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand name Samsung or Nokia");
		//sc.nextLine();
		int s=sc.nextInt();

			if(s==1)
			{ 
				System.out.println("Model no is:"+s1.mn+" Model is "+s1.name+" Price is:"+s1.price+" Size of model is:"+s1.size);
			}
			else if (s==2)
			{
				System.out.println("Model no is:"+n1.mn+" Model is "+n1.name+" Price is:"+n1.price+" Size of model is:"+n1.size);
			}
	}
}