import java.lang.System;
import java.lang.String;
class Addition
{

	int len=35;
	int wd=65;
	public static void main(String a[])
	{
		Addition b1=new Addition();
		int x=32;
		int y=45;
		int res=x+y;
		int res1=b1.len+b1.wd;
		System.out.println("Addition of int is");
		System.out.println(res);
		System.out.println("Addition from object is");
		System.out.println(res1);
		System.out.println("---------------------------");
		/*
		System.out.println("Addition of int is",res);
		System.out.println("Addition from object is",res1);
		*/
	} 
}