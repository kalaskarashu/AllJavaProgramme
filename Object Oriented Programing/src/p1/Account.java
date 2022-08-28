package p1;
class accounttest
{
	private int number;
	private double balance;
	private double amount;
	private int another;

	accounttest(int number,double balance)
	{
		this.number=number;
		this.balance=balance;
	}
	void getAccount()
	{
		System.out.println("Number:"+number+" Balance:"+balance);
	}
	public int getNumber()
	{
		return this.number;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setCredit(double balance)
	{
		this.balance=balance;
	}
	public void updateDebit(double amount)
	{
		if(this.balance>=amount)
		{
			this.balance=this.balance-amount;
		}
		else 
		{
			System.out.println("Amount Exeeded");
		}
	}
	public void transferTo(int another,double amount)
	{
		if(this.balance>=amount)
		{
			this.amount=amount;
			this.another=another;
			this.number=number;
			this.balance=this.balance-amount;
			System.out.println("Account Number:"+another+" Balance:"+amount);
		}
		else 
		{
			System.out.println("Amount Exeeded");
		}
	}
}
class Account
{
	public static void main(String[] args) 
	{
		accounttest a1=new accounttest(123,0.0);
		a1.getAccount();
		int x=a1.getNumber();
		System.out.println("Account Number:"+x);
		double y=a1.getBalance();
		System.out.println("Balance:"+y);
		a1.setCredit(15000);
		a1.getAccount();
		a1.updateDebit(1000);
		a1.getAccount();
		System.out.println("Transfer Amount");
		a1.transferTo(567,2000);
		a1.getAccount();
	}
	
}
