package set.Hashset;

public class Employee 
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
	
	
}
