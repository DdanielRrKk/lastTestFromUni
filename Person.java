package testUni;

class Person implements Comparable{
	private String fname;
	private String lname;
	private int age;
	
	Person(String fn,String ln,int a){fname=fn;lname=ln;age=a;}
	
	public String getFname() {return fname;}
	public String getLname() {return lname;}
	public int getAge() {return age;}
	
	@Override
	public int compareTo(Object o) {
		Person p=(Person)o;
		Integer i1=age;
		Integer i2=p.getAge();
		return i1.compareTo(i2);
	}
	
	public String toString() {
		return ""+fname+" "+lname+" "+age;
	}
}
