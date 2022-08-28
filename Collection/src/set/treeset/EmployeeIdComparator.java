package set.treeset;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		double i1=o1.getId();
		double i2=o2.getId();
		return new Double(i1).compareTo(new Double(i2));
	}

}
