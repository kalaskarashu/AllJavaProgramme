import java.util.Scanner;
class Acc
{
	private int acno;
	private double bal;
	Acc(int acno, double bal )
	{
		this.acno=acno;
		this.bal=bal;
	}
	void printAccount()
	{
		System.out.println("Acc no:"+this.acno+" Bal is:"+this.bal);
	}
	public int getAccount()
	{
		return this.acno;
	}
	public double getBalance()
	{
		return this.bal;
	}
	public void setBalance(double bal)
	{
		this.bal=bal;
	}
	public void updateCredit(double c)
	{
		this.bal=this.bal+c;
	}
	public void updateDebit(double d)
	{
		this.bal=this.bal-d;
	}

}
class NewAccount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account No");
		int p=sc.nextInt();
		System.out.println("Enter the Balance");
		double q=sc.nextDouble();
		Acc a1=new Acc(p,q);
		a1.printAccount();
		int x=a1.getAccount();
		double y=a1.getBalance();
		System.out.println("Account No is:"+x);
		System.out.println("Balance No is:"+y);
		System.out.println("Set New Balance");
		double q1=sc.nextDouble();
		a1.setBalance(q1);
		a1.printAccount();
		System.out.println("Enter the Credit Amount");
		double c1=sc.nextDouble();
		a1.updateCredit(c1);
		a1.printAccount();
		System.out.println("Enter the Debit Amount");
		double d1=sc.nextDouble();
		a1.updateDebit(d1);
		a1.printAccount();

	}
	
}