package p1;
class rectangletest
{
	private float length;
	private float width;
	rectangletest()
	{
		length=1.0f;
		width=1.0f;
	}
	public void printRectangle()
	{
		System.out.println("Length:"+length+" Width:"+width);
	}
	public float getLength()
	{
		return this.length;
	}
	public void setLength(float length)
	{
		this.length=length;
	}
	public float getWidth()
	{
		return this.width;
	}
	public void setWidth(float width)
	{
		this.width=width;
	}
	public float getArea()
	{
		return this.length*this.width;
	}
	public float getPerimeter()
	{
		return (2*this.length)+(2*this.width);
	}
}
class Rectangle
{
	public static void main(String[] args) 
	{
		rectangletest r1=new rectangletest();
		r1.printRectangle();
		float a=r1.getLength();
		System.out.println("Length:"+a);
		r1.setLength(3.0f);
		float b=r1.getWidth();
		System.out.println("Length:"+b);
		r1.setWidth(5.0f);
		r1.printRectangle();
		float c=r1.getArea();
		System.out.println("Area:"+c);
		float d=r1.getPerimeter();
		System.out.println("Perimeter:"+d);
	}
}