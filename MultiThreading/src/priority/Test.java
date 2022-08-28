package priority;
class A extends Thread
{
	@Override
	public void run() {
		for(int i=1; i<=5; i++)
		{
			
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+11*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+13*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class Test {
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.setName("A");
		a1.setPriority(2);
		B b1=new B();
		b1.setName("B");
		b1.setPriority(7);
		a1.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b1.start();
		
		
	}
	

}
