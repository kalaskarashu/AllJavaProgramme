package p1;
class Helper
{
    void Print()
    {
        System.out.println("Helper Print");
    }
}
class Sub1 extends Helper
{
    void Print()
    {
        System.out.println("Sub1 Print");
    }
}
class Sub2 extends Helper
{
    void Print()
    {
        System.out.println("Sub2 Print");
    }
}
class Sub3 extends Helper
{
    void Print()
    {
        System.out.println("Sub 3 Print");
    }
}
public class ASH {
    public static void main(String[] args) 
    {
      /*  Helper h1=new Helper();
       h1.Print();
       Sub1 s1=new Sub1();
       s1.Print();
       Sub2 s2=new Sub2();
       s2.Print();
       Sub3 s3=new Sub3();
       s3.Print(); */
       Helper a; //Creating Prent class object
       a=new Sub1();
       a.Print();
       a=new Sub2();
       a.Print();
       a=new Sub3();
       a.Print();


    }
}
