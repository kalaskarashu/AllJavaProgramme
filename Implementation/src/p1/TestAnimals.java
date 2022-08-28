package p1;
interface Pet
{
	String getName();
	void setName(String name);
	void Play();

}
abstract class Animal
{
	int legs;
	Animal()
	{
		legs=0;
	}
	Animal(int legs)
	{
		this.legs=legs;
	}
	abstract void Eat();
	abstract void Walk();
	{
		System.out.println("");
	}
}
class Spider extends Animal
{
	Spider()
	{

	}
	Spider(int legs)
	{
		super(legs);
	}
	
	public void getSpider()
	{
		System.out.println("Spider have 8 legs");
	}
	@Override
	public void Eat()
	{
		System.out.println("Spiders eat insect");
	}
	@Override
	public void Walk()
	{
		System.out.println("Spiders walk by 8 legs");
	}
}
class Cat extends Animal implements Pet
{
	String name;
	Cat()
	{

	}
	Cat(int legs,String name)
	{
		super(legs);
		this.name=name;
	}
	@Override
	public void Eat()
	{
		System.out.println("Cat Can eat Rat as well as milk");
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void Play()
	{
		System.out.println("Cat playing ball");
	}
	public void Walk()
	{
		System.out.println("Cat Walk by 4 legs");
	}
}
class Fish extends Animal implements Pet
{
	String name;
	Fish()
	{

	}
	Fish(int legs,String name)
	{
		super(legs);
		this.name=name;
	}
	@Override
	public void Eat()
	{
		System.out.println("Fish Can eat Small fish");
	}
	//@override
	public void Walk()
	{
		System.out.println("Fish has "+super.legs+" Hence Fish is Swim");
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void Play()
	{
		System.out.println("Fish Swim");
	}
}
 

class TestAnimals
{
	public static void main(String[] args) 
	{
		System.out.println("____________________Spider__________________");
		Pet p1=new Cat();
		Animal a1=new Cat();
		Animal aaa1=new Spider();
		aaa1.Eat();
		aaa1.Walk();
		Spider s1=new Spider();
		s1.getSpider();
		System.out.println("____________________Cat__________________");
		Cat c1=new Cat(4,"Fluffy");
		System.out.println(c1.getName());
		c1.setName("Tom");
		System.out.println(c1.getName());
		c1.Eat();
		c1.Play();
		System.out.println("____________________Fish__________________");
		Animal aa1=new Fish();
		Fish f1=new Fish(0,"Machhi");
		f1.Eat();
		System.out.println(f1.getName());
		f1.setName("WaterQueen");
		System.out.println(f1.getName());
		f1.Play();
		f1.Walk();

	}
}