package p1;
class Book
{
	private String name;
	private double price;
	private int qty;
	private Auther owner;
	Book(String name,double price,int qty,Auther owner)
	{
		this.name=name;
		this.price=price;
		this.qty=qty;
		this.owner=owner;
	}
	public void printbook()
	{
		System.out.println("Book Name:"+this.name+" Price:"+this.price+" Qty:"+this.qty);
		//System.out.println("Auther:"+this.owner);
	}
	public Auther getAuther()
	{
		return this.owner;
	}
	public String getName()
	{
		return this.name;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getQty()
	{
		return this.qty;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
}
class Auther
{
	private String name;
	private String email;
	private char gender;
	Auther(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	void printAuther()
	{
		System.out.println("Auther name:"+this.name+" Email:"+this.email+" Gender: "+this.gender);
	}
	public String getName()
	{
		return this.name;
	}
	public String getEmail()
	{
		return this.email;
	}
	public char getGender()
	{
		return this.gender;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}

}
class BookTest
{
	public static void main(String[] args) 
	{
		Auther a1=new Auther("Ashutosh","ashu@gmail.com",'M');
		Book b1=new Book("Physic",49.78,1,a1);
		System.out.println("____________BOOK____________");
		b1.printbook();
		b1.getAuther().printAuther();
		System.out.println("Book Name:"+b1.getName());
		System.out.println("Price:"+b1.getPrice());
		b1.setPrice(100);
		System.out.println("New Price:"+b1.getPrice());
		System.out.println("Qty:"+b1.getQty());
		b1.setQty(5);
		System.out.println("Qty:"+b1.getQty());
		System.out.println("____________Auther____________");
		a1.printAuther();
		System.out.println("Auther name:"+a1.getName());
		System.out.println("Email:"+a1.getEmail());
		System.out.println("Gender:"+a1.getGender());
		a1.setEmail("ashutosh@hotmail.com");
		System.out.println("Changed Email:"+a1.getEmail());
		a1.printAuther();

	}
}