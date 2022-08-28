import java.util.Scanner;
class Account
{
	int sr;
	String name;
	double balance;

	int getAccno()
	{
		return sr;
	}
	String getName()
	{
		return name;
	}
	double getBal()
	{
		return balance;
	}

}
class AccountTest
{
	public static void main(String args[])
	{
		Account a1=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		int x=sc.nextInt();
		a1.sr=x;
		System.out.println("Enter the name");
		sc.nextLine();
		String y=sc.nextLine();
		a1.name=y;
		System.out.println("Enter the balance");
		double z=sc.nextDouble();
		a1.balance=z;
		System.out.println("Acc no is "+a1.getAccno()+" name of holder:"+a1.getName()+" Bal is:"+a1.getBal());

	}
}