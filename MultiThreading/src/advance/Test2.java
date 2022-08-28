package advance;


class MyTable
{
	synchronized void printTable(int n)
	{
		//synchronized (this) {
			
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+n*i);
		}
		//}
	}
	void printFactor(int m)
	{	
		
		int res=1;
		for (int i = 1; i <=m; i++) 
		{
			res=res*i;
		}
		System.out.println(Thread.currentThread().getName()+" "+"Factor "+res);
	}
	
}
class A extends Thread
{
	MyTable table;
	A(MyTable table)
	{
		this.table=table;
	}
	@Override
	public void run() {
	table.printTable(3);
	table.printFactor(5);
	}
}
class B extends Thread
{
	MyTable table;
	B(MyTable table)
	{
		this.table=table;
	}
	@Override
	public void run() {
	table.printTable(9);
	table.printFactor(6);
	}
}
public class Test2 {

	public static void main(String[] args) 
	{
		MyTable t1=new MyTable();
		A a1=new A(t1);
		B b1=new B(t1);
		a1.setName("A");
		b1.setName("B");
		a1.start();
		b1.start();

	}

}
