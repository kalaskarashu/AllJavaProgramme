package p1;
class A 
{
  public int multiply(int a,int b)
  {
    return a*b;
  } 
  public double multiply(double a,double b)
  {
    return a*b;
  } 
}
class Test
{
    public static void main(String[] args) 
    {
        A a1=new A();
        System.out.println(a1.multiply(10,20));
        System.out.println(a1.multiply(10.89, 20.00));
    }
}
