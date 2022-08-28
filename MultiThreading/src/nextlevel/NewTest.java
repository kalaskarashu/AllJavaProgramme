package nextlevel;
class A extends Thread
{
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+" p "+Thread.currentThread().getPriority()+" " +11*i);
		}
	}
}
public class NewTest {

	public static void main(String[] args) {
		A a1=new A();
		a1.setName("A");
		a1.setPriority(8);
		a1.start();
//	  [main,                                           5,                              main]
//	main thread name                            thread priority                  mian thread group
	
	

	}

}
