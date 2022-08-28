package set.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Shaym","None",32,"Junagav");
		Employee e2=new Employee("Ankush","None",33,"Junagav");
		Employee e3=new Employee("Pappu","None",34,"Bhuldhana");
		Employee e4=new Employee("Ankit","None",31,"Junagav");
		EmployeeIdComparator empcom=new EmployeeIdComparator(); 
		TreeSet<Employee> emps=new TreeSet<Employee>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		//TreeSet<Employee> emps=new TreeSet<Employee>();
		Iterator<Employee> itr=emps.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
