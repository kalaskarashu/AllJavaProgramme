import java.util.Scanner;
class Rec
{
	Float l,b;
	public static void main(String a[])
	{
		Rec r=new Rec();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		r.l=sc.nextFloat();
		System.out.println("Enter the width");
		r.b=sc.nextFloat();
		float res=r.b*r.l;
		System.out.println(res);
		float res1=(2*r.l)+(2*r.b);
		System.out.print("perimeter of rectangle is ");
		System.out.println(res1);
	}
}
class Circle
{
	double r;
	public static void main(String a[])
	{
		Circle c=new Circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		c.r=sc.nextDouble();
		double res=3.14*(c.r)*(c.r);
		System.out.print("Area of circle is ");
		System.out.println(res);
		double res1=2*3.14*(c.r);
		System.out.print("Circumference of circle is ");
		System.out.println(res1);
	}
}
class Triangle
{
	double b,h;
	public static void main(String a [])
	{
		Triangle t1=new Triangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		t1.b=sc.nextDouble();
		System.out.println("Enter the height");
		t1.h=sc.nextDouble();
		double res=0.50*(t1.b)*(t1.h);
		System.out.println(res);

	}
}