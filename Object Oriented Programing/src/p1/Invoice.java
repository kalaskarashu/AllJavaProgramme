package p1;
class invoiceitem
{
	private String id;
	private String desc;
	private int qty;
	private double unitprice;
	invoiceitem(String id,String desc,int qty,double unitprice)
	{
		this.id=id;
		this.desc=desc;
		this.qty=qty;
		this.unitprice=unitprice;
	}
	void printInvoiceItem()
	{
		System.out.println("Id:"+this.id+" Desc:"+this.desc+" Qty:"+this.qty+" UnitPrice:"+this.unitprice);
	}
	public String getId()
	{
		return this.id;
	}
	public String getDesc()
	{
		return this.desc;
	}
	public int getQty()
	{
		return this.qty;
	}
	public double getUnitprice()
	{
		return this.unitprice;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public void setUnitprice(double unitprice)
	{
		this.unitprice=unitprice;
	}
	public double getTotal()
	{
		return this.unitprice*this.qty;
	}
	public String toString()
	{
		return "InvoiceItem[id="+id+",Desc="+desc+",qty="+qty+",Unitprice="+unitprice+"]";
	}
}
class Invoice
{
	public static void main(String[] args) 
	{
		invoiceitem i1=new invoiceitem("Parle","Biscuit",0,0.0);
		String a=i1.getId();
		System.out.println("Id:"+a);
		String b=i1.getDesc();
		System.out.println("Desc:"+b);
		int c=i1.getQty();
		System.out.println("Qty:"+c);
		double d=i1.getUnitprice();
		System.out.println("UnitPrice:"+d);
		i1.printInvoiceItem();
		i1.setQty(100);
		i1.setUnitprice(5);
		i1.printInvoiceItem();
		double x1=i1.getTotal();
		System.out.println("Total Unit price:"+x1);
		System.out.println(i1);

	}
}