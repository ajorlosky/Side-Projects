package studentDB;

public class Student {

	private Name fname;
	private Name lname;
	private int gl;
	private String grade;
	
	public Student(String f, String l, int level, String g) {
		fname = new Name(f);
		lname = new Name(l);
		gl = level;
		grade = g;
	}
	
	public Student(String l) {
		lname = new Name(l);
	}
	
	public void changeName(String f, String l) {
		fname.changeName(f);
		lname.changeName(l);
	}
	
	public void changeGL(int level) {
		gl = level;
	}
	
	public void changeGrade (String g) {
		grade = g;
	}
	
	public String getName() {
		return(fname.getName()+ " " + lname.getName());
	}
	
	public int getGL() {
		return(gl);
	}
	
	public String getGrade() {
		return(grade);
	}
	
	public String toString() {
		String info;
		
		info = fname.getName()+" "+lname.getName()+"\n";
		info += "Grade Level: " + gl + "\n";
		info += "Grade: " + grade + "\n";
		
		return(info);
	}
	
	public boolean equals(Object tempStu) { 
		Student Stu = (Student)tempStu;
		System.out.println(Stu.lname.getName());
		System.out.println(lname.getName());
		if (Stu.lname.getName().equals(lname.getName())) {
			return (true);
		}
		else {
			return(false);
		}
	}
}
