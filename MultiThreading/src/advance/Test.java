package advance;


class Table
{
	synchronized public void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Harry extends Thread
{
	Table table;
	 Harry(Table table)
	{
		this.table=table;
	}
	@Override
	public void run() 
	{
		table.printTable(5);
	}
}
class Potter extends Thread
{
	Table table;
	Potter(Table table)
	{
		this.table=table;
	}
	@Override
	public void run() 
	{
		table.printTable(4);
	}
}

public class Test {

	public static void main(String[] args) 
	{
		Table table=new Table();
		Harry h1=new Harry(table);
		Potter p1=new Potter(table);
		h1.setName("Harry");
		p1.setName("Potter");
 		h1.start();
 		p1.start();
	}

}
