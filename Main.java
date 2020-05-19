package testUni;

class Main {
	public static void main(String[] args) {
		Student s1=new Student("Daniel","Kostov",20,"18621439");
		Student s2=new Student("Kiril","Stoqnov",21,"18621440");
		Student s3=new Student("Ali","Zaba",20,"18621438");
		Student s4=new Student("Filip","Qnkov",19,"18621444");
		Student s5=new Student("Martin","Todorov",22,"18621435");
		
		StudentGroup sg=new StudentGroup("4-A");
		sg.addStudent(s1);
		sg.addStudent(s2);
		sg.addStudent(s3);
		sg.addStudent(s4);
		sg.addStudent(s5);
		
		System.out.println("======= Normal, unsorted =======");
		System.out.println(sg);
		
		sg.sortByLname();
		System.out.println("======= Sorted by Last name =======");
		System.out.println(sg);
		
		sg.sortByFname();
		System.out.println("======= Sorted by First name =======");
		System.out.println(sg);
		
		sg.sortByAge();
		System.out.println("======= Sorted by Age =======");
		System.out.println(sg);
		
		
	}
}
