package practice;

public class Account {
	double balance=10000;
	
	synchronized void Withdrawn(double amt)
	{
		System.out.println("Before withdrawn balance: "+this.balance);
		if(amt>this.balance)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.balance=this.balance-amt;
		System.out.println("Balance after withdrawn: "+this.balance);
	}
	synchronized void Deposit(double amt)
	{
		System.out.println("Balance before adding amt: "+this.balance);
		this.balance=this.balance+amt;
		System.out.println("Balance After adding amt: "+this.balance);
		notify();
	}
}