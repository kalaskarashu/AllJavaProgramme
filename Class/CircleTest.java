import java.util.Scanner;
class circle
{
	int radius;
	int getDia()
	{
		return 2*radius;
	}
	double getArea()
	{
		return 3.14*radius*radius;
	}
	double getCircumference()
	{
		return 2*3.14*radius;
	}
}

class CircleTest
{
	public static void main(String args[])
	{
		circle c1=new circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int rad=sc.nextInt();
		c1.radius=rad;
		System.out.println("Dia is "+c1.getDia());
		System.out.println("Area is "+c1.getArea());
		System.out.println("Circumference is "+c1.getCircumference());
	}
}