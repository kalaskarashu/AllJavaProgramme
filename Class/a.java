import java.util.Scanner;
class watch1
{
	private int hr;
	private int min;
	private int sec;
	watch1(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	void displayClock()
	{
		System.out.println("Hr:"+hr+" Min:"+min+" Sec:"+sec);
	}
	public int getHr()
	{
		return this.hr;
	}
	public int getMin()
	{
		return this.min;
	}
	public int getSec()
	{
		return this.sec;
	}
	public void setHr(int hr)
	{
		this.hr=hr;
	}
	public void setMin(int min)
	{
		this.min=min;
	}
	public void setSec(int sec)
	{
		this.sec=sec;
	}

}
class watchtest1
{
	public static void main (String args[])

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for Casio");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println("Enter the value for Titan");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int z1=sc.nextInt();
		watch1 casio=new watch1(x,y,z);
		watch1 titan=new watch1(x1,y1,z1);
		casio.displayClock();
		titan.displayClock();
		int a=titan.getMin();
		System.out.println(a);
		System.out.println("enter changed value");
		int k=sc.nextInt();
		casio.setMin(k);
		casio.displayClock();

	}
}
