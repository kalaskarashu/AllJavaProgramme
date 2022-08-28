package p1;
class employeetest
{
	private int id;
	private String firstname;
	private String lastname;
	private double salary;
	employeetest(int id,String firstname,String lastname,int salary)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	} 
	public void getEmployee()
	{
		System.out.println("id:"+id+" Firstname:"+firstname+" lastname:"+lastname+" Salary:"+salary);
	}
	public int getId()
	{
		return this.id;
	}
	public void getFirstName()
	{
		System.out.println("FirstName:"+this.firstname);
	}
	public String getLastname()
	{
		return this.lastname;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getAnnualSalary()
	{
		return this.salary;
	}
	public double raiseSalary(double percent)
	{
		return (this.salary)*((percent+100)/100);
	}
}
class Employee
{
	public static void main(String[] args) 
	{
		employeetest e1=new employeetest(123,"Ashutosh","Kalaskar",0);
		e1.getEmployee();
		int x=e1.getId();
		System.out.println("ID:"+x);
		e1.getFirstName();
		String y=e1.getLastname();
		System.out.println("LastName:"+y);
		double z=e1.getSalary();
		System.out.println("Salary:"+z);
		e1.setSalary(15000);
		e1.getEmployee();
		double z1=e1.getSalary();
		System.out.println("Updated Salary:"+z1);
		double z2=e1.getAnnualSalary();
		System.out.println("Annual Salary:"+z2*12);
		e1.raiseSalary(10);
		e1.getEmployee();




	}
}