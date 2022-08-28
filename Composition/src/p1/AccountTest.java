package p1;
class Customer
{
   private int id;
   private String name;
   private char gender;
   Customer(int id,String name,char gender)
   {
   	this.id=id;
   	this.name=name;
   	this.gender=gender;
   }
   public void printCustomer()
   {
   	System.out.println("Id:"+this.id+" Name:"+this.name+" Gender:"+this.gender);
   }
   public int getId()
   {
   	return this.id;
   }
   public String getName()
   {
   	return this.name;
   }
   public char getGender()
   {
   	return this.gender;
   }
}
class Account
{
	private int id;
	private Customer owner;
	private double balance;
	private double amount;
	Account(int id,double balance,Customer owner)
	{
		this.id=id;
		this.balance=balance;
		this.owner=owner;
	}
	public Customer getCustomer()
	{
		return this.owner;
	}
	public void printAccount()
	{
		System.out.println("Id:"+this.id+" Balance:"+this.balance);
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setBalance(double balance)
	{
       this.balance=balance;
	}
	public void updateDeposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	public void updateWithdraw(double amount)
	{
		if(this.balance>=amount)
		{
			this.balance=this.balance-amount;
		}
		else 
		{
			System.out.println("Amount Exceeds");
		}
	}
}
class AccountTest
{
	public static void main(String[] args) 
	{
		Customer c1=new Customer(123,"Ashutosh",'M');
		Account a1=new Account(555,5578.98,c1);
		System.out.println("____________Customer_____________");
		c1.printCustomer();
		System.out.println("Id:"+c1.getId());
		System.out.println("Name:"+c1.getName());
		System.out.println("Gender:"+c1.getGender());
		System.out.println("____________Account_____________");
		a1.printAccount();
		a1.getCustomer().printCustomer();
		System.out.println("Balance:"+a1.getBalance());
		a1.setBalance(8000);
		System.out.println("New Balance:"+a1.getBalance());
		a1.updateDeposit(2000);
		System.out.println("After Deposite 2000 || Balance:"+a1.getBalance());
		a1.updateWithdraw(3000);
		System.out.println("After Withdraw 3000 || Balance:"+a1.getBalance());
		a1.getCustomer().getName();

	}
}