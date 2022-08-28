package ipc;
class Account
{
	double balance=10000;
	
	synchronized void printDebit(double amt)
	{
		System.out.println(Thread.currentThread().getName()+" "+"Pre Balance before debit"+this.balance);
		if(amt>this.balance)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance=this.balance-amt;
		System.out.println(Thread.currentThread().getName()+" "+"Balance after debit"+this.balance);
	}
	synchronized void printCredit(double amt)
	{
		System.out.println(Thread.currentThread().getName()+" "+"Pre Balance before credit"+this.balance);
		this.balance=this.balance+amt;
		System.out.println(Thread.currentThread().getName()+" "+"Balance after credit"+this.balance);
		notify();
	}
}
class DebitThread extends Thread
{
	Account acc;
	public DebitThread(Account acc) 
	{
		this.acc=acc;
	}
	@Override
	public void run() 
	{
		acc.printDebit(15000);
	}
}
class CreditThread extends Thread
{
	Account acc;
	public CreditThread(Account acc) 
	{
		this.acc=acc;
	}
	@Override
	public void run() 
	{
		acc.printCredit(5000);
	}
}
public class AccountTest
{
	public static void main(String[] args) 
	{
		Account acc=new Account();
		DebitThread dt=new DebitThread(acc);
		CreditThread ct=new CreditThread(acc);
		dt.setName("Ashu");
		ct.setName("Pappus");
		dt.start();
		ct.start();
	}
	
}