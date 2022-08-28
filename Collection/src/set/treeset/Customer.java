package set.treeset;

public class Customer implements Comparable<Customer>{
	String name;
	int id;
	String city;
	double price;
	public Customer(String name, int id, String city, double price) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", city=" + city + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Customer o) {
		return new String(this.name).compareTo(new String(o.name));
	}
	

}
