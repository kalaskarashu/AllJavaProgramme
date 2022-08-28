import java.util.Scanner;
class newcir
{
	private double radius;
	private String color;
	newcir(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public double getArea()
	{
		return 3.14*this.radius*this.radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public String getColor()
	{
		return this.color;
	}

}
class Newcircle
{
	public static void main(String args[])
	{
		double radius=1.0;
		String color="red";
		newcir c1=new newcir(2.0,"blue");
		newcir c2=new newcir(2.0,"red");
		newcir c3=new newcir(1.0,"red");
		double x1=c1.getArea();
		double y1=c1.getRadius();
		String z1=c1.getColor();
		double x2=c2.getArea();
		double y2=c2.getRadius();
		String z2=c2.getColor();
		double x3=c3.getArea();
		double y3=c3.getRadius();
		String z3=c3.getColor();
		System.out.println("Radius of circle "+radius+" Color is "+color+" Area of circle is "+3.14*radius*radius);
		System.out.println();
		System.out.println("-----------C1 Circle--------------");
		System.out.println("Radius of "+y1+" Color is "+z1+" Area of cicle "+x1);
		System.out.println();
		System.out.println("-----------C2 Circle--------------");
		System.out.println("Radius of "+y2+" Color is "+z2+" Area of cicle "+x2);
		System.out.println();
		System.out.println("-----------C3 Circle--------------");
		System.out.println("Radius of "+y3+" Color is "+z3+" Area of cicle "+x3);
	}
}