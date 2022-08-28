package p1;
class Circle
{
	private double radius;
	private String color;
	/*Circle()
	{
		radius=1.0;
		color="Red";
	}*/
	Circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	void printCircle()
	{
		System.out.println("Radius:"+this.radius+" Color:"+this.color);
	}
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public double getArea()
	{
		return 2*3.14*this.radius;
	}
}
class Cylinder extends Circle
{
	private double height;
	Cylinder(double radius,String color,double height)
	{
		super(radius,color);
		this.height=height;
		//this.radius=radius;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public void printCylinder()
	{

		System.out.println("Radius:"+super.getRadius()+" Height"+this.height+" color:"+super.getColor());
	}
	/*public void setRadius(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public double getVolume()
	{
		return 3.14*this.radius*this.radius*this.height;
	}*/
	public double getVolume()
	{
		return 3.14*super.getRadius()*super.getRadius()*this.height;
	}
	public double getSUperRadius()
	{
		return super.getRadius();
	}
}
class CircleTest
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle(1.0,"Red");
		double a=c1.getRadius();
		System.out.println("Radius:"+a);
		c1.printCircle();
		c1.setRadius(5.0);
		double g=c1.getRadius();
		System.out.println(g);
		String b=c1.getColor();
		System.out.println("Color:"+b);
		c1.setColor("Blue");
		System.out.println("New color:"+c1.getColor());
		c1.printCircle();
		double c=c1.getArea();
		System.out.println("Area of circle:"+c);
		System.out.println("________Cylinder__________");
		Cylinder cy1=new Cylinder(c1.getRadius(),c1.getColor(),1.0);
		System.out.println("Height of cylinder:"+cy1.getHeight());
		cy1.printCylinder();
		cy1.setHeight(5.0);
	    cy1.printCylinder();
	   // cy1.setRadius(g,c1.getColor());
		System.out.println("Volume of cylinder is:"+cy1.getVolume());
		cy1.printCylinder();
		System.out.println("SuperRadius:"+cy1.getSUperRadius());

			
	}
}