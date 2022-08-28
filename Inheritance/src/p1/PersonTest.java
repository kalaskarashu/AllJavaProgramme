package p1;
class person
{
	 String name;
	String address;
	person()
	{
		this.name="Ashutosh";
		this.address="";
	}
	public void printPerson()
	{
		System.out.println("Name:"+this.name+" Addresss:"+this.address);
	}
	public String getName()
	{
		return this.name;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setAdress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return "Name:"+this.name+" Address="+this.address;
	}
}
class student extends person
{
	private String program;
	private int year;
	private double fee;
	student()
	{	
		this.program="";
		this.year=2021;
		this.fee=12000;

	}
	public void setAdress(String address)
	{
		this.address=address;
	}
	public void printStudent()
	{
		System.out.println("Name:"+super.getName()+" Addresss:"+super.getAddress()+" Programe:"+this.program+" Year:"+this.year+" Fee:"+this.fee);
		//System.out.println("Programe:"+program+" Year:"+year+" Fess:"+fee);
		//System.out.println("This is not a message");
	}
	public String getProgram()
	{
		return program;
	}
	public void setProgram(String program)
	{
		this.program=program;
	}
	public int getYear()
	{
		return year;
	} 
	public void setYear(int year)
	{
		this.year=year;
	}
	public double getFee()
	{
		return this.fee;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public String toString()
	{
		return "[Programe="+this.program+" Fees="+this.fee+" Year="+this.year+"]";
	}

}
class staff extends person
{
	private String school;
	private double pay;
	staff()
	{
		this.school="Aided";
		this.pay=500;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void printStaff()
	{
		System.out.println("Name:"+super.getName()+" Address:"+super.getAddress()+" School:"+this.school+" Pay:"+this.pay);
	}
	public String getSchool()
	{
		return this.school;
	}
	public void setSchool(String school)
	{
		this.school=school;
	}public double getPay()
	{
		return this.pay;
	}
	public void setPay(double pay)
	{
		this.pay=pay;
	}
		public String toString()
	{
		return "[School="+this.school+" Pay="+this.pay+"]";
	}
}
class PersonTest
{
	public static void main(String[] args) 
	{
		person p1=new person();
		System.out.println("______Person______");
		p1.printPerson();
		System.out.println("Name:"+p1.getName());
		System.out.println("Adress:"+p1.getAddress());
		p1.setAdress("Pune");
		p1.printPerson();
		System.out.println("_____________Student__________");
		student s1=new student();
		s1.setAdress(p1.getAddress());
		s1.printPerson();
		System.out.println("Programe:"+s1.getProgram());
		s1.setProgram("Dance");
		System.out.println("New Programe:"+s1.getProgram());
		System.out.println("Year:"+s1.getYear());
		s1.setYear(2022);
		System.out.println("New Year:"+s1.getYear());
		System.out.println("Feee:"+s1.getFee());
		s1.setFee(15000);
		System.out.println("New Feee:"+s1.getFee());
		s1.printPerson();
		System.out.println("_____________Staff_________");
		staff st1=new staff();
		st1.setAddress(p1.getAddress());
		st1.printStaff();
		System.out.println("School:"+st1.getSchool());
		st1.setSchool("Shahu college");
		System.out.println("School:"+st1.getSchool());
		System.out.println("Pay:"+st1.getPay());
		st1.setPay(1000);
		System.out.println("Pay:"+st1.getPay());
		st1.printStaff();
		System.out.println(p1);
		System.out.println(s1);
		System.out.println(st1);






	}
}