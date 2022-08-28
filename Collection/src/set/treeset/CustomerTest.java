package set.treeset;

import java.util.*;
//import java.util.TreeSet;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1=new Customer("Ashutosh",12,"Buldhana",135.78);
		Customer c2=new Customer("Abhay",22,"Chikhali",189.568);
		Customer c3=new Customer("Abhishek",32,"Khamgaon",234.78);
		Customer c4=new Customer("Chetan",42,"Akola",99.78);
		CustomerIdComparator cid=new CustomerIdComparator();
		CustomerPriceComparator cpr=new CustomerPriceComparator();
		Scanner sc=new Scanner(System.in);
		TreeSet<Customer> tr=new TreeSet<Customer>();
		
		tr.add(c1);
		tr.add(c2);
		tr.add(c3);
		tr.add(c4);
	Iterator<Customer>	itr=tr.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
		
	}
}
