package ipc;

public class Debit extends Thread {
	Person ps;
	Debit(Person ps)
	{
		this.ps=ps;
	}
	@Override
	public void run() {
		ps.DebitPrint(15000);
	}

}
