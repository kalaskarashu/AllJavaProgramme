class Singleton{

	private static Singleton singleton_instance=null;
	private Singleton()
	{

	}

	public static Singleton getInstance()
	{
		if(singleton_instance==null)
		{
			singleton_instance=new Singleton();
		}
		return singleton_instance;
	}
}
class Test{
	 public static void main(String[] args) {
		Singleton x=Singleton.getInstance();
		System.out.println(x.hashcode());
		Singleton y=Singleton.getInstance();
		System.out.println(y.hashcode());
		Singleton z=Singleton.getInstance();
		System.out.println(z.hashcode());
	}
}