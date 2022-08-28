package set.treeset;

import java.util.Comparator;

public class CustomerPriceComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return new Double(o1.getPrice()).compareTo(new Double(o2.getPrice()));
	}
	
	

}
