//package p1;
abstract class LN
{
	int i;
	int j;
	LN(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	abstract int getMul();
	abstract int getAdd();
}
class PN extends LN
{
	int k;
	int l;
	PN(int i,int j,int k,int l)
	{
		super(i,j);
		this.k=k;
		this.l=l;

	}
	public int getMul()
	{
		return i*j*k*l;
	}
	public int getAdd()
	{
		return i+k+j+l;
	}
	public void setI(int i)
	{
		this.i=i;
	}
	public int getI()
	{
		return this.i;
	}
	public String toString()
	{
		return "hi my name is ashutosh "+i+" "+j+ " "+k+" "+l;
	}
}
 														

class Simple
{
	public static void main(String[] args) 
	{
		LN l1=new PN(2,4,6,8);
		System.out.println(l1.getMul());
		System.out.println(l1);
	}
}