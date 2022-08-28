import java.util.Scanner;
class Basic12
{
	int x;
	int y;
	float z;
	char j;
	int res;
	String name="Govinda";
	Basic12(int x,int y,float z,char j)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.j=j;
	}
	int printMul()
	{
		return x*y;
	}
	void printFun()
	{
		System.out.println("Int: "+x+" 2Int:"+y+" Float: "+z+" Char:"+j);
	}
}
class Basic23
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		System.out.println(b1.a);
		System.out.println(b1.name);
		//int res=b1.x*b1.y;
		//int p=b1.printMul();*/
		
		System.out.println("Ente the int");
		int a=sc.nextInt();
		System.out.println("Ente the int");
		int b=sc.nextInt();
		System.out.println("Ente the Float");
		float c=sc.nextFloat();
		System.out.println("Ente the char");
		char d=sc.next().charAt(0);
		sc.nextLine();
		String nmae=sc.nextLine();

		Basic12 b1=new Basic12(a,b,c,d);
		System.out.println(b1.printMul());
		b1.printFun();
	}
}	