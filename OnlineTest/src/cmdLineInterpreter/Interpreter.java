package cmdLineInterpreter;

/**
 * 
 * By running the main method of this class we will be able to
 * execute commands associated with the SystemManager.  This command
 * interpreter is text based. 
 *
 */
import java.util.Scanner;
import onlineTest.SystemManager;

public class Interpreter {

	public static void main(String[] args) {

		SystemManager manager = new SystemManager();
		Scanner input = new Scanner(System.in);
		int choice;
		int another = 1;
		String name, text;
		boolean answer;
		int examId, questionNumber;
		double points;
		// while loop continues until the command line chooses not to perform another
		// option (another !=1)
		while (another == 1) {
			choice = 0;
			// while loop makes sure that the person chooses an option between 1-5.
			while (choice < 1 || choice > 5) {
				System.out.println("Enter a number (1-5) for your corresponding choice below: ");
				System.out.print("1: Enter a student\n" + "2: Enter an exam\n" + "3: Add a true/false question\n"
						+ "4: Answer a true/false question\n" + "5: Get exam score for a student\n");
				choice = input.nextInt();
			}
			// switch statement runs code for each choice of the interpreter
			switch (choice) {
			case 1:
				// inputs a student name to the system
				input.nextLine();
				System.out.println("Enter a student name: ");
				name = input.nextLine();
				System.out.println("Student named: " + name + " added: " + manager.addStudent(name));
				break;
			case 2:
				// inputs an exam with an id to the system
				input.nextLine();
				System.out.println("Enter a valid exam name: ");
				name = input.nextLine();
				System.out.println("Enter a valid exam id number: ");
				examId = input.nextInt();
				System.out.println(name + " with id #" + examId + " added: " + manager.addExam(examId, name));
				break;
			case 3:
				// inputs a valid question on a specific exam with a specified points, stem, and
				// answer
				System.out.println("Enter a valid exam id number: ");
				examId = input.nextInt();
				System.out.println("Enter a valid question number (start at 1): ");
				questionNumber = input.nextInt();
				System.out.println("How many points is the question worth: ");
				points = input.nextDouble();
				input.nextLine();
				System.out.println("Enter the true/false question stem: ");
				text = input.nextLine();
				System.out.println("What is the answer (true or false)?: ");
				answer = input.nextBoolean();
				manager.addTrueFalseQuestion(examId, questionNumber, text, points, answer);
				break;
			case 4:
				// allows a student to answer a specific true false question on the exam
				// according the id and question number given
				input.nextLine();
				System.out.println("Enter a valid student name: ");
				name = input.nextLine();
				System.out.println("Enter a valid exam id number: ");
				examId = input.nextInt();
				System.out.println("Enter a valid question number: ");
				questionNumber = input.nextInt();
				System.out.println("What is the answer (true or false)?: ");
				answer = input.nextBoolean();
				manager.answerTrueFalseQuestion(name, examId, questionNumber, answer);
				break;
			case 5:
				// outputs the exam score for a given student on a certain exam (using exam id)
				input.nextLine();
				System.out.println("Enter a valid student name: ");
				name = input.nextLine();
				System.out.println("Enter a valid exam id number: ");
				examId = input.nextInt();
				System.out.println("Exam Score for " + name + " on exam with id # " + examId + ": "
						+ manager.getExamScore(name, examId));
				break;
			}
			//user chooses to continue adding items to the catalog
			System.out.println("Would you like to continue adding items to the course catalog? (0 = no, 1 = yes): ");
			another = input.nextInt();
		}

		input.close();
	}
}
