package ipc;

public class Credit extends Thread {
	Person ps;
	Credit(Person ps)
	{
		this.ps=ps;
	}
	@Override
	public void run() {
		ps.CreditPrint(5000);
	}

}
