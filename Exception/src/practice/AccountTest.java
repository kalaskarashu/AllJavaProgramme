package practice;
class InsufficientBalanceException extends RuntimeException
{
	public InsufficientBalanceException()
	{
		
	}
	public InsufficientBalanceException(String str)
	{
		super(str);
	}
}
class Person {

	private String name;
	private int age;
	private String address;
	Person()
	{
		
	}
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
class Account extends Person  
{
	String bname;
	double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String name, int age, String address, String bname, double balance) {
		super(name, age, address);
		this.bname = bname;
		this.balance = balance;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void debitUpdate(double amt) 
	{
		if(this.balance<amt)
		{
			//throw new InsufficientBalanceException("Balance Excceds"+this.balance);
			throw new InsufficientBalanceException("Balance exceds"+this.balance);
		}
		else
			this.balance=this.balance-amt;	
			
		
	}
	@Override
	public String toString() {
		return "Account [bank=" + bname + ", balance=" + balance + "]";
	}
	
	

}
class AccountTest
{
	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.setName("Ashutosh");
		p1.setAge(25);
		p1.setAddress("Buldhana");
		System.out.println(p1.toString());
		Account a1=new Account();
		a1.setBname("SBI");
		a1.setBalance(10000);
		System.out.println(a1.toString());
		a1.debitUpdate(9000);
		System.out.println(a1.toString());
	}
}