//Static inner class
class Outer1
{
	int outerField=11;
	void outerfunction()
	{
		System.out.println("Outer class Function");
	}
	static class Inner1
	{
		int innerField=22;
		void innerFunction()
		{
		System.out.println("Inner class Function");
		}
	}
}
class Type2
{
	public static void main(String[] args) 
	{
		// If we create inner class as static then to create inner class Object
		// we dont need outer class Object
		Outer1.Inner1 in=new Outer1.Inner1();
		in.innerFunction();
	}
}