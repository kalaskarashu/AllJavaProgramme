//Anonymous Inner class
abstract class popcorn
{
	abstract void taste();
}
interface Instrument
{
	void Play();
} 
class Type3 
{
	public static void main(String[] args) 
	{
	//class noName extends Popcorn
		Popcorn p1=new Popcorn()
		{
			public void taste()
			{
				System.out.println("Spicy");
			}
		};
		p1.taste();
	 Instrument i1= new Instrument()
	 {
    
        public void play(){
        	System.out.println("Guitar ");
        }

     };
   
    i1.Play();

	}
	
}