package practice;

public class Demo {

	public static void main(String[] args) {
		Account acc=new Account();
		WithdrawnThread wth=new WithdrawnThread(acc);
		Thread th=new Thread(wth);
		th.setName("shyam");
		DepositThread dth1=new DepositThread(acc);
		Thread th1=new Thread(dth1);
		th1.setName("Ram");
		th.start();
		th1.start();
		

	}

}
