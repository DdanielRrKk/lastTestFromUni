package testUni;

class Student extends Person implements Comparable{
	private String fn;
	
	Student(String fnm,String ln,int a,String s){super(fnm,ln,a);fn=s;}
	
	public void setFn(String s) {fn=s;}
	public String getFn() {return fn;}
	
	@Override
	public boolean equals(Object o) {
		Student st=(Student)o;
		return fn.equals(st.getFn());
	}
	
	public String toString() {
		return ""+super.getFname()+" "+super.getLname()+" "+super.getAge()+" "+fn+"\n";
	}
	
	@Override
	public int compareTo(Object o) {
		Student st=(Student)o;
		return fn.compareTo(st.getFn());
	}
	
	
}
