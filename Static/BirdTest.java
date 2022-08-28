class Bird
{
	int i;
	static int cnt;
	Bird()
	{
		i++;
		cnt++;
	}
}
class BirdTest
{
	public static void main(String[] args) 
	{
		Bird b1=new Bird();
		Bird b2=new Bird();
		Bird b3=new Bird();
		System.out.println(b1.i);
		System.out.println(b3.cnt);
	}
}