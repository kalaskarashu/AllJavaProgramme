package practice;

public class WithdrawnThread implements Runnable {
	Account acc;

	public WithdrawnThread(Account acc) {
		this.acc = acc;
	}

	public void run()
	{
		acc.Withdrawn(15000);
	}
}
