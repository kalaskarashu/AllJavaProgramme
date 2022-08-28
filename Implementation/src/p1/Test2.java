interface f1
{
	int x=10;
	//void play();
	String getName();
	void setName();
}
class f2 implements f1
{
	String name;
	f2(String name)
	{
		super(f1.setname());
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
class Test2
{
	public static void main(String[] args) 
	{
		f2 f=new f2("Ashu");
		System.out.println(f.getName());
		f.setName("Chetan");
		System.out.println(f.getName());
	}
}