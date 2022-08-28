package upcating.downcating;
class Parent
{
	String name;
	Parent()
	{
		
	}
	void Nature()
	{
		System.out.println("Boss of family");
	}
}
class Child extends Parent
{
	String color;
	Child()
	{
		
	}
	void Nature()
	{
		System.out.println("Children are god");
	}
}
public class Test {

	public static void main(String[] args) 
	{
		Parent p2=new Parent();
		p2.Nature();
    	Parent p1=new Child();
		p1.name="Abhay";
		System.out.println(p1.name);
		p1.Nature();
		Child c1=new Child();
		c1.name="Ankush";
		c1.color="White";
		c1.Nature();
		//______________________________Downcasting______________________________
		System.out.println("_____________________Downcasting___________________");
		//Parent p1=new Child();
		Child c=(Child)p1;
		p1.name="Ashutosh";
		System.out.println(p1.name);
		c.Nature();
		c.color="black";
		System.out.println(c.color);
		p1.Nature();

	}

}
