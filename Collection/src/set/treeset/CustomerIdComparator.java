package set.treeset;

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
	}

}
