package p1;
class Customer
{
	private int id;
	private String name;
	private int discount;
	Customer(int id,String name,int discount)
	{
		this.id=id;
		this.name=name;
		this.discount=discount;
	}
	public void printCustomer()
	{
		System.out.println("Id:"+id+" Name:"+name+" Discount:"+discount);
	}
	public int getID()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public int getDiscount()
	{
		return this.discount;
	}
	public void setDiscount(int discount)
	{
		this.discount=discount;
	}
	public void getAname()
	{
		System.out.println("Name:"+this.name);
	}
}
class Invoice
{
	private int id;
	private double amount;
	private Customer owner;
	Invoice(int id, double amount,Customer owner)
	{
		this.id=id;
		this.amount=amount;
		this.owner=owner;
	}
	public Customer getCustomer()
	{
		return this.owner;
	}
	public void printInvoice()
	{
		System.out.println("Invoice Id:"+this.id+" Amount:"+this.amount);
		this.owner.printCustomer();
	}

	/*public Customer setCustomer(Customer owner)
	{
		this.owner=owner;
	}*/
	public double getAmount()
	{
		return this.amount;
	}
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	public double getDisamount()
	{
		return this.amount*0.8;
	}
}
class InvoiceTest
{
	public static void main(String[] args) 
	{
		Customer c1=new Customer(11,"Ashutosh",0);
		Invoice i1=new Invoice(23,500,c1);
		System.out.println("____________Customer__________");
		c1.printCustomer();
		System.out.println("Id:"+c1.getID());
		System.out.println("Name:"+c1.getName());
		System.out.println("Discount:"+c1.getDiscount());
		c1.setDiscount(20);
		System.out.println("New Discount:"+c1.getDiscount());
		c1.printCustomer();

		System.out.println("____________Invoice__________");
		i1.printInvoice();
		i1.getCustomer().printCustomer();
		//i1.setCustomer(22,"Chetan",40);
		System.out.println("Amount:"+i1.getAmount());
		i1.setAmount(600);
		System.out.println("New Amount:"+i1.getAmount());
		System.out.println("Amount after discount"+i1.getDisamount());
		i1.getCustomer().getAname();




	}
}