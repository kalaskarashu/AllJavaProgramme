package practice;

public class Test {

	public static void main(String[] args) {
		Harry h1=new Harry();
		Thread th1=new Thread(h1);
		th1.start();
		Potter p1=new Potter();
		Thread th2=new Thread(p1);
		th2.start();
		

	}

}
