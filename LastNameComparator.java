package testUni;

import java.util.Comparator;

class LastNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return (((Person) o1).getLname().compareTo(((Person) o2).getLname()));
	}
	
}
