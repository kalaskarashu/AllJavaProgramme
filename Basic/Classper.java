import java.util.Scanner;
class Classper
{
	public static void main(String ref [])
	{
		float a,b,c,d,e,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks 1 sub");
		a=sc.nextFloat();
		System.out.println("Enter marks 2 sub");
		b=sc.nextFloat();
		System.out.println("Enter marks 3 sub");
		c=sc.nextFloat();
		System.out.println("Enter marks 4 sub");
		d=sc.nextFloat();
		System.out.println("Enter marks 5 sub");
		e=sc.nextFloat();
		System.out.println("Total marks");
		f=sc.nextFloat();
		float total=a+b+c+d+e;
		float avg=total/5;
		float percentage=(total/f)*100;
		System.out.print("Total marks is ");
		System.out.println(total);
		System.out.print("Average marks is ");
		System.out.println(avg);
		System.out.print("Percentage is ");
		System.out.println(percentage);


	}
}