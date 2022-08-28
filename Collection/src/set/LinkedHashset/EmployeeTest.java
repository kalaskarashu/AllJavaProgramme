package set.LinkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

import set.Hashset.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Ashutosh","BM",21,"Buldhana");
		Employee e2=new Employee("Chetan","AO",22,"Kalayan");
		Employee e3=new Employee("Abhay","AAO",23,"Chikhali");
		Employee e4=new Employee("Bhau","Kamgar",24,"Dhad");
		LinkedHashSet<Employee> emp=new LinkedHashSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		Object em[]=emp.toArray();
		for(int i=0;i<em.length;i++)
		{
			System.out.println(em[i]);
		}
		System.out.println("------------------------------------------------------");
		Employee e5=new Employee("Abhu","Fireman",25,"Sagwaon");
		Employee e6=new Employee("Ankush","Designer",26,"Maldev");
		Employee e7=new Employee("Abhu","Fireman",25,"Sagwaon");
		Employee e8=new Employee("Abhu","Fireman",25,"Sagwaon");
		LinkedHashSet<Employee> emps=new LinkedHashSet<Employee>();
		emps.add(e5);
		emps.add(e6);
		emps.add(e7);
		emps.add(e8);
		Iterator<Employee> itr=emps.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
