package set.treeset;

public class Employee implements Comparable<Employee>
{
	String name;
	String job;
	int id;
	String city;
	public Employee(String name, String job, int id, String city) {
		super();
		this.name = name;
		this.job = job;
		this.id = id;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", job=" + job + ", id=" + id + ", city=" + city + "]\n";
	}
	@Override
	public int compareTo(Employee e) {
//		double m1=this.id;
//		double m2=e.id;
//		if(m1>m2)
//			return 1;
//		
//		else if(m1<m2)
//			return -1;
//		
//		else
//			return 0;
		return new String(this.name).compareTo(new String(e.name));
	}

	
	
}
