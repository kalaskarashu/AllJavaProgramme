package practice;

public class Harry implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+11*i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
}
