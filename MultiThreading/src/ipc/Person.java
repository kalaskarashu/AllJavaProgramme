package ipc;

public class Person {
	double balance=10000;
	synchronized void DebitPrint(double amt)
	{
		System.out.println(Thread.currentThread().getName()+" "+"Pre balance before debit"+this.balance);
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
			System.out.println(Thread.currentThread().getName()+" "+"Pre balance after debit"+this.balance);	
	
	}
	synchronized void CreditPrint(double amt)
	{
		System.out.println(Thread.currentThread().getName()+" "+"Pre balance before credit"+this.balance);
		this.balance=this.balance+amt;
		System.out.println(Thread.currentThread().getName()+" "+"Pre balance after credit"+this.balance);
		notify();
		
	}

}
