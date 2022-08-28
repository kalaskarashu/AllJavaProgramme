package practice;

public class DepositThread implements Runnable {
	Account acc;
	public DepositThread(Account acc) {
		this.acc = acc;
	}
	public void run()
	{
		acc.Deposit(5000);
	}

}
