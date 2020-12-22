package studentDB;

import java.util.ArrayList;
import java.util.Scanner;

public class Database {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Student> class4A = new ArrayList<Student>();
		String tempf, templ, tempg;
		Student tempStu;
		int tempgl, i; 
	
		//creates the array list
		do {
			System.out.print ("Enter Students first name: ");
			tempf = input.next();
			System.out.print ("Enter Students last name: ");
			templ = input.next();
			System.out.print ("Enter Students grade level: ");
			tempgl = input.nextInt();
			System.out.print ("Enter Students current grade: ");
			tempg = input.next();
			tempStu = new Student(tempf, templ, tempgl, tempg);
			class4A.add(tempStu);
			System.out.print("Do you wish to enter another student? (1)YEs/(0)No");
		} while (input.nextInt() != 0);

		//Change a students grade
		System.out.println("What is the last name of the student whose grade you wish to change? ");
		templ = input.next();
		System.out.println("What do you want to change their grade to?");
		tempg = input.next();
		tempStu = new Student(templ);
		i = class4A.indexOf(tempStu);
		class4A.get(i).changeGrade(tempg);
		
		
		//print list
		for (i=0; i<class4A.size(); i++) {
			System.out.println(class4A.get(i));
		}
		input.close();
		
	}

}
