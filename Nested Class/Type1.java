class Outer
{
	int outerField=11;
	void outerFunction()
	{
		System.out.println("Outer class Function");
	}
	//Inner class
	class Inner
	{
		int innerField=22;
		void innerFunction()
		{
			System.out.println("Inner class Funcyion");

		}
	}
}
class Type1
{
	public static void main(String[] args) 
	{
		Outer out=new Outer();
		out.outerFunction();
		System.out.println(out.outerField);
		Outer.Inner in=out.new Inner();
		in.innerFunction();
		System.out.println(in.innerField);
	}
}