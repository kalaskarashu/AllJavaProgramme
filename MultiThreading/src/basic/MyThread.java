package basic;

public class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName()+" "+11*i);
	}
}
