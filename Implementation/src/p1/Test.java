package p1;
interface Instrument
{
	void play();
	String what();
	void adjust();
}
class Wind implements Instrument
{
	public void play()
	{

		System.out.println("Playing by blowing wind into instrument");
	}
	public String what()
	{
		return "Air flow throw wind";
	}
	public void adjust()
	{
		System.out.println("Wind adjust something");
	}
}
class Percussion implements Instrument
{
	public void play()
	{

		System.out.println("Percussion is musical instrument");
	}
	public String what()
	{
		return "Percussion sounded by struck";
	}
	public void adjust()
	{
		System.out.println("Percussion adjust something");
	}
}
class Stringed implements Instrument
{
	public void play()
	{

		System.out.println("Music made from string");
	}
	public String what()
	{
		return "Voilin is string instrument";
	}
	public void adjust()
	{
		System.out.println("Adjusment through string");
	}
}
class Woodwind extends Wind
{
	public void play()
	{

		System.out.println("Wind make sound from Wood");
	}
	public String what()
	{
		return "Wood make less noise";
	}
} 
class Brass extends Wind
{
	public void play()
	{

		System.out.println("Brass is nothing");
	}
	public String what()
	{
		return "Brass is nothing and nothing";
	}
} 

class Test
{
	public static void main(String[] args) 
	{
		Wind w1=new Wind();
		w1.play();
		System.out.println(w1.what());
		w1.adjust();
		Percussion p1=new Percussion();
		p1.play();
		System.out.println(p1.what());
		p1.adjust();
		Stringed s1=new Stringed();
		s1.play();
		System.out.println(s1.what());
		s1.adjust();
		//Instrument ii1=new Wind();
		Woodwind ww1=new Woodwind();
		ww1.play();
		System.out.println(ww1.what());
		ww1.adjust();
		Wind b1=new Brass();
		b1.play();
		System.out.println(b1.what());
		b1.adjust();
	}
}