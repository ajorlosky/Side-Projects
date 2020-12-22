package onlineTest;

import java.util.*;
import java.io.*;

public class SystemManager implements Manager, Serializable {

	// students ArrayList holds data for all students on the course catalog. exams
	// HashMap holds many exams with individual examIds.
	// TreeMap holds the gradeCutoffs specified by the setCutoffs method (key is the
	// letter corresponding to the grade value)
	private ArrayList<Student> students = new ArrayList<Student>();
	private HashMap<Integer, Exam> exams = new HashMap<Integer, Exam>();
	private TreeMap<String, Double> gradeCutoffs = new TreeMap<String, Double>();
	private static final long serialVersionUID = 1L;

	// adds an exam to the database if the examId is unique. also creates a new exam
	// score with the id in both the exams hashmap and students arrayList.
	public boolean addExam(int examId, String title) {
		if (exams.containsKey(examId)) {
			return false;
		} else {
			exams.put(examId, new Exam(title));
			Exam e = exams.get(examId);
			for (Student stu : students) {
				stu.addExamScore(examId);
				e.addStudent(stu.getName());
			}
			return true;
		}
	}

	// adds a Student to the arrayList of students given the student is not in it
	// already.
	public boolean addStudent(String name) {
		boolean check = true;
		for (Student stu : students) {
			if (stu.getName() == name) {
				check = false;
				break;
			}
		}
		// check is true if the student's name is in the ArrayList of students. If not,
		// it adds all exams to the student object.
		if (check) {
			students.add(new Student(name));
			Set<Integer> examIds = exams.keySet();
			for (Integer id : examIds) {
				Exam e = exams.get(id);
				e.addStudent(name);
				students.get(students.size() - 1).addExamScore(id);
			}
		}
		return check;
	}

	// returns the grading report for a student's specfic exam
	public String getGradingReport(String studentName, int examId) {
		String report = "";
		Exam e = exams.get(examId);
		ArrayList<Question> examQs = e.getExam();
		// using arrayList of questions in the exam the for-each loop returns the
		// number, points earned/total points per question, and exam score for the
		// entire exam
		for (Question q : examQs) {
			report += "Question #" + q.getQuestionNumber() + " "
					+ e.getStudentPointsByQuestion(studentName, q.getQuestionNumber()) + " points out of "
					+ q.getQuestionPoints() + "\n";
		}
		report += "Final Score: " + getExamScore(studentName, examId) + " out of " + e.getExamPoints();
		return report;
	}

	// returns the examScore for a specific student using the students ArrayList
	public double getExamScore(String studentName, int examId) {
		double score = 0.0;
		for (Student stu : students) {
			if (studentName.equals(stu.getName())) {
				score = stu.getExamScore(examId);
			}
		}
		return score;
	}

	// returns the minimum score for an exam in the database.
	public double getMinScore(int examId) {
		double minScore = Double.MAX_VALUE;
		// for each loop saves the lowest exam score in the arrayList of students for a
		// specific exam
		for (Student stu : students) {
			if (stu.getExamScore(examId) < minScore) {
				minScore = stu.getExamScore(examId);
			}
		}
		return minScore;
	}

	// returns the minimum score for an exam in the database.
	public double getMaxScore(int examId) {
		double maxScore = Double.MIN_VALUE;
		// for each loop saves the highest exam score in the arrayList of students for a
		// specific exam
		for (Student stu : students) {
			if (stu.getExamScore(examId) > maxScore) {
				maxScore = stu.getExamScore(examId);
			}
		}
		return maxScore;
	}

	// returns the average score for an exam in the database
	public double getAverageScore(int examId) {
		double averageScore = 0.0;
		// searches though the ArrayList of students and adds each exam score to an
		// average and divdes by the total number of students
		for (Student stu : students) {
			averageScore += stu.getExamScore(examId);
		}
		averageScore = averageScore / students.size();
		return averageScore;
	}

	// sets the letter grades cuttoffs by adding a each key and value to the treemap
	public void setLetterGradesCutoffs(String[] letterGrades, double[] cutoffs) {
		int i = 0;
		for (String grade : letterGrades) {
			gradeCutoffs.put(grade, cutoffs[i]);
			i++;
		}
	}

	// gets the course numeric grade by adding the individual exam scores for a
	// specific student and dividing by total exams
	public double getCourseNumericGrade(String studentName) {
		Set<Integer> examIds = exams.keySet();
		double courseGrade = 0.0;
		double numExams = exams.size();
		for (Integer id : examIds) {
			courseGrade += 100 * (getExamScore(studentName, id) / exams.get(id).getExamPoints());
		}
		courseGrade = courseGrade / numExams;
		return courseGrade;
	}

	// uses the course numeric grade to determine a letter grade corresponding to
	// the tree map of letter grades
	public String getCourseLetterGrade(String studentName) {
		String letterGrade = "";
		// breaks the for each loop for an individual student once the corresponding
		// letter grade in the treemap is found
		for (Student stu : students) {
			if (stu.getName().equals(studentName)) {
				for (Map.Entry<String, Double> elem : gradeCutoffs.entrySet()) {
					if (getCourseNumericGrade(studentName) >= elem.getValue()) {
						letterGrade = elem.getKey();
						break;
					}
				}
			}
		}
		return letterGrade;
	}

	// sorts the students alphabetically and returns a string with each name,
	// numeric grade, and letter grade
	public String getCourseGrades() {
		String courseGrades = "";
		Collections.sort(students);
		for (Student stu : students) {
			courseGrades += stu.getName() + " " + getCourseNumericGrade(stu.getName()) + " "
					+ getCourseLetterGrade(stu.getName()) + "\n";
		}
		return courseGrades;

	}

	// returns the key for a specific exam
	public String getKey(int examId) {
		if (exams.containsKey(examId)) {
			Exam exam = exams.get(examId);
			String key = exam.printExam();
			return key;
		} else {
			return "Exam not found";
		}

	}

	// adds a fillInTheBlank question to the exam with the specified examId number
	public void addFillInTheBlanksQuestion(int examId, int questionNumber, String text, double points,
			String[] answer) {
		Set<Integer> examIds = exams.keySet();
		Arrays.sort(answer);
		// after finding the desired exam, the exam from the hashmap adds the fill in
		// the blanks question in the exam class.
		for (Integer num : examIds) {
			if (examId == num) {
				Exam exam = exams.get(num);
				exam.addFillInTheBlanksQuestion(questionNumber, text, points, answer);
			}
		}
	}

	public void answerFillInTheBlanksQuestion(String studentName, int examId, int questionNumber, String[] answer) {
		double totalBlanks = 0;
		double totalCorrect = 0;
		Arrays.sort(answer);
		// after finding the desired exam and student, the answer choices are compared
		// to the key's answers and gives partial or full credit if earned.
		for (Student stu : students) {
			if (stu.getName() == studentName) {
				Exam e = exams.get(examId);
				totalBlanks = e.getMultipleChoiceOrFillBlankAnswer(questionNumber).length;
				for (String a : answer) {
					for (String keyAns : e.getMultipleChoiceOrFillBlankAnswer(questionNumber))
						if (a == keyAns) {
							totalCorrect++;
						}
				}
				double percentPointsGiven = totalCorrect / totalBlanks;
				e.addPoints(studentName, percentPointsGiven * (e.getQuestionPoints(questionNumber)));
				stu.addPoints(percentPointsGiven * e.getQuestionPoints(questionNumber), examId);
			}
		}
	}

	// adds a truefalse question to the exam with the specified examId number
	public void addTrueFalseQuestion(int examId, int questionNumber, String text, double points, boolean answer) {
		Set<Integer> examIds = exams.keySet();
		for (Integer num : examIds) {
			if (examId == num) {
				Exam exam = exams.get(num);
				exam.addTrueFalseQuestion(questionNumber, text, points, answer);
			}
		}
	}

	// answers the true false question by checking if the specific question answer
	// equals the students answer. it adds points if the answer is correct.
	public void answerTrueFalseQuestion(String studentName, int examId, int questionNumber, boolean answer) {
		for (Student stu : students) {
			if (stu.getName().equals(studentName)) {
				Exam e = exams.get(examId);
				if (answer == e.getTrueFalseAnswer(questionNumber)) {
					e.addPoints(studentName, e.getQuestionPoints(questionNumber));
					stu.addPoints(e.getQuestionPoints(questionNumber), examId);
				} else {
					e.addPoints(studentName, 0.0);
					stu.addPoints(0.0, examId);
				}
			}
		}
	}

	// adds a multiple choice question to the exam with the specified examId number
	public void addMultipleChoiceQuestion(int examId, int questionNumber, String text, double points, String[] answer) {
		Set<Integer> examIds = exams.keySet();
		for (Integer num : examIds) {
			if (examId == num) {
				Exam exam = exams.get(num);
				exam.addMultipleChoiceQuestion(questionNumber, text, points, answer);
			}
		}
	}

	// answers the true false question by checking if the specific question answer
	// equals the students answer. it adds points if the entire answer is correct.
	public void answerMultipleChoiceQuestion(String studentName, int examId, int questionNumber, String[] answer) {
		boolean checkCorrect = true;
		for (Student stu : students) {
			if (stu.getName() == studentName) {
				Exam e = exams.get(examId);
				int i = 0;
				// compares entire student's answer for multiple choice to make sure each answer
				// is correct and the length of the answer is the exact same as the key for the
				// question
				for (String a : answer) {
					if (a != e.getMultipleChoiceOrFillBlankAnswer(questionNumber)[i]
							|| answer.length != e.getMultipleChoiceOrFillBlankAnswer(questionNumber).length) {
						checkCorrect = false;
						break;
					}
					i++;
				}
				if (checkCorrect) {
					e.addPoints(studentName, e.getQuestionPoints(questionNumber));
					stu.addPoints(e.getQuestionPoints(questionNumber), examId);
				} else {
					e.addPoints(studentName, 0.0);
					stu.addPoints(0.0, examId);
				}
			}
		}
	}

	// serialization of the manager object using the given file name
	public void saveManager(Manager manager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream output = new ObjectOutputStream(file);
			output.writeObject(manager);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// deserialization of the file name into a SystemManager object that is returned
	public Manager restoreManager(String fileName) {
		SystemManager sm = null;
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
			sm = (SystemManager) input.readObject();
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return sm;
	}

}
