package set.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Ashutosh","Clerk",11,"Buldhana");
		Employee e2=new Employee("Chetan","Salesman",12,"Kalyan");
		Employee e3=new Employee("Abhay","Clerk",13,"Chikhali");
		Employee e4=new Employee("BHau","Seth",11,"Dhad");
		
		HashSet<Employee> emp=new HashSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		System.out.println("IsContain "+emp.contains(e1));
		
		
	Iterator<Employee>	itr=emp.iterator();
	while(itr.hasNext())
	{
		Employee e=itr.next();
		System.out.println(e);
	}
	System.out.println("-----------------------------------------");
	Object ob[]=emp.toArray();
	for(int i=0;i<ob.length;i++)
	{
		System.out.println(ob[i]);
	}
	}

}
