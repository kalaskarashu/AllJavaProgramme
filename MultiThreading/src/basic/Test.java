package basic;

public class Test {

	public static void main(String[] args) 
	{
		MyThread myth=new MyThread();
		//myth.run();
		myth.start(); //internally system will create separate thread and allocates sepateater stack for it
		myth.setName("Ashu");
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName()+" "+13*i);
	}

}
