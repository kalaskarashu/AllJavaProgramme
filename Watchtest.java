import java.util.Scanner;
class Watch
{
	private int hr;
	private int min;
	private int sec;
	private String name;
	Watch(int hr,int min,int sec,String name)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		this.name=name;
	}
	void printClock()
	{
		System.out.println("Hr: "+this.hr+" min: "+this.min+" sec: "+this.sec+" name:"+this.name);
	}
	int pC()
	{
		return this.hr;
	}
	public int getMin()

	{
		return this.min;
	} 
}
class WatchTest
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Entre the number");
		double x=sc.nextDouble();
		System.out.println("Entre the name");
		sc.nextLine();
		String y=sc.nextLine();
		System.out.println("Number is"+x);
		System.out.println("Name is "+y);
		char c=sc.nextLine().charAt(0);
		System.out.println("Enterthe hours");
		int h=sc.nextInt();
		System.out.println("Enterthe min");
		int m=sc.nextInt();
		System.out.println("Enterthe sec");
		int s=sc.nextInt();
		System.out.println("Enterthe name");
		sc.nextLine();
		String n=sc.nextLine();*/
		Watch fastrack=new Watch(45,65,45,"Factrack");
		Watch rolex=new Watch(11,22,33,"Rolex");
		Watch casio=new Watch(23,45,899,"Casio");
		//printf("%d",x);
		//printf(" %c")
		fastrack.printClock();
		rolex.printClock();
		casio.pC();
		rolex.pC();
		int v=rolex.pC();
		System.out.println("hr"+v);
		int q=casio.pC();
		System.out.println("hr"+q);
		//System.out.println("hr "+rolex.hr);
		int w=fastrack.getMin();
		System.out.println("Min "+w);

	}
}