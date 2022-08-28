package p1;
abstract class Shape
{
	String color="Red";
	boolean filled=true;
	Shape()
	{
	}
	Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	abstract double getArea();
	abstract double getPerimeter();
	public String toString()
	{
		return "Shape[Color="+this.color+", Filled="+this.filled+"]";
	}

} 
class Circle extends Shape
{
	 double radius=1.0;
	Circle()
	{
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		 return 3.14*this.radius*this.radius;
	}
	public double getPerimeter()
	{
		return 2*3.14*this.radius;

	}
	public String toString()
	{
		return "Circle[Shape[Color="+super.color+"Filled="+super.filled+" Radius="+this.radius+"]";
	}

}
class Rectangle extends Shape
{
	double length=1;
	double width=1;
	Rectangle()
	{

	}
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	Rectangle(double length,double width,String color,boolean filled)
	{
		super(color,filled);
		this.length=length;
		this.width=width;
		
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getArea()
	{
		return this.length*this.width;
	}
	public double getPerimeter()
	{
		return 2*this.length+2*this.width;
	}
	public String toString()
	{
		return "Rectangle[Shape[Color="+color+"Filled="+super.filled+"],Width="+this.width+" Length="+this.length+"]";
	}
}
/*class Square extends Rectangle
{
	double side;
	Square()
	{
		//super(color,length,width);
		side=25;
	}
	public double getSide()
	{
		return this.side;
	}
	public void setSide(double side)
	{
		this.side=side;
	}
	public void setLength(double side)
	{
		length=side;
	}
	public void setWidth(double side)
	{
		width=side;
	}
	public String toString()
	{
		return "Square[Rectangle[Shape[color="+color+"],Width="+this.width+",Length="+this.length+"]]";
	}


}*/
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("___________________Circle________________________");
		Circle c1=new Circle();
		System.out.println("Radius of Circle "+c1.getRadius());
		c1.setRadius(10);
		System.out.println("New Radius of Circle "+c1.getRadius());
		Shape sh=new Circle(c1.getRadius(),"Black",false);
		System.out.println("Color="+sh.getColor());
		sh.setColor("Blue");
		System.out.println(sh);
		System.out.print("Area of circle=");
		System.out.println(sh.getArea());
		System.out.print("Perimeter of circle=");
		System.out.println(sh.getPerimeter());
		System.out.println("___________________Rectangle________________________");
		Rectangle r1=new Rectangle();
		System.out.println("Length="+r1.getLength());
		r1.setLength(10);
		System.out.println("New Length="+r1.getLength());
		System.out.println("Width="+r1.getWidth());
		r1.setWidth(20);
		System.out.println("New Width="+r1.getWidth());
		Shape sh1=new Rectangle(r1.getLength(),r1.getWidth(),"Pink",true);
		System.out.print("Area of Rectangle=");
		System.out.println(sh1.getArea());
		System.out.print("Perimeter of Rectangle=");
		System.out.println(sh1.getPerimeter());
		System.out.println(sh1);
		//Rectangle r=new Square();
		//System.out.println(r);*/

	}
}