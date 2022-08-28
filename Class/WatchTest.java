import java.util.Scanner;
class Watch
{
	private int hr;
	private int min;
	private int sec;
	Watch (int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	void displayClock()
	{
		System.out.println("HR:"+hr+" min:"+min+" Sec:"+sec);
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
class WatchTest
{
	public static void main(String args[])
	{
		Watch fastrack=new Watch(11,22,33);
		System.out.println("Fastrack");
		fastrack.displayClock();
		Watch rolex=new Watch(55,44,66);
		System.out.println("Rolex");
		rolex.displayClock();
		int new_hr=rolex.getHr();
		int new_min=rolex.getMin();
		int new_sec=rolex.getSec();
		System.out.println(new_min);

		rolex.setMin(88);
		fastrack.setSec(505);
		System.out.println("Rolex");
		rolex.displayClock();
		System.out.println("Fastrack");
		fastrack.displayClock();

	}
}