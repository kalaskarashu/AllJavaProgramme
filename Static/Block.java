class StaticBlock
{
	static int k;
	static
	{
		k=3;
		System.out.println("Static Block exceutes");
	}
	{
		System.out.println("Instunces field");
	}
	StaticBlock()
	{
		System.out.println("Construter Exceutes");
	}
	{
		System.out.println("Instunces field");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method Exceutes");
		StaticBlock s1=new StaticBlock();
	}
}