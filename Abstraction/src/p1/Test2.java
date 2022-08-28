abstract class Shape
{
	String color;
	Shape(String color)
	{
		this.color=color;
	}
	abstract double getArea();
	public String getColor()
	{
		return color;
	}
	public abstract String toString();

}
class Circle extends Shape
{
	double radius;
	Circle(String color,double radius)
	{
		super(color);
		this.radius=radius;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public String toString()
	{
		return "Color of circle is "+super.getColor()+" area of circle is "+getArea();
	}
}
class Test2
{
	public static void main(String[] args) 
	{
		Shape s1=new Circle("Blue",5);
		System.out.println(s1);
	}
}