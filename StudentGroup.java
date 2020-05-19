package testUni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentGroup{
	String group;
	List<Student> ls=new ArrayList<Student>();
	
	StudentGroup(String g){group=g;}
	
	public void addStudent(Student st) {ls.add(st);}
	
	public void sortByLname() {
		LastNameComparator lastName = new LastNameComparator();
		Collections.sort(ls,lastName);
	}
	
	public void sortByFname() {
		Collections.sort(ls, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getFname().compareTo(o2.getFname());
			}
		});
	}
	
	public void sortByAge() {
		Collections.sort(ls, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getFn().compareTo(o2.getFn());
			}
		});
	}
	
	public String toString() {
		return ""+group+"\n"+ls;
	}
	
}
