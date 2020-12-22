package onlineTest;

import java.io.Serializable;
import java.util.*;

public class Exam implements Serializable {

	private ArrayList<Question> examQuestions;
	private HashMap<String, ArrayList<Double>> questionPoints;
	private double examPoints;
	private static final long serialVersionUID = 1L;

	// constructor that creates empty exam of questions and a hashmap contains
	// points by question for each student
	public Exam(String examName) {
		examQuestions = new ArrayList<Question>();
		questionPoints = new HashMap<String, ArrayList<Double>>();
	}

	// prints the exam by each question in the ArrayList
	public String printExam() {
		String key = "";
		for (Question questions : examQuestions) {
			key += questions.toString() + "\n";
		}
		return key;
	}

	// adds a student to the hashmap with an arrayList for points per question for
	// the student
	public void addStudent(String studentName) {
		questionPoints.put(studentName, new ArrayList<Double>());
	}

	// returns totalpoints for the exam
	public double getExamPoints() {
		return examPoints;
	}

	// returns the specific amount of points earned by student for a question
	public double getStudentPointsByQuestion(String studentName, int questionNumber) {
		return questionPoints.get(studentName).get(questionNumber - 1);
	}

	// adds points to a students exam if the question student name is valid
	public void addPoints(String studentName, double points) {
		if (questionPoints.containsKey(studentName)) {
			ArrayList<Double> scoreByQuestion = questionPoints.get(studentName);
			scoreByQuestion.add(points);
			questionPoints.put(studentName, scoreByQuestion);
		}
	}

	// returns the exam with the ArrayList of Questions
	public ArrayList<Question> getExam() {
		return examQuestions;
	}

	// returns the multiple choice or fill in blank question answer
	public String[] getMultipleChoiceOrFillBlankAnswer(int questionNumber) {
		String[] mcAnswer = {};
		for (Question q : examQuestions) {
			if (q.getQuestionNumber() == questionNumber) {
				mcAnswer = q.getArrayAnswer();
			}
		}
		return mcAnswer;
	}

	// returns the total points for a given question
	public double getQuestionPoints(int questionNumber) {
		double points = 0.0;
		for (Question q : examQuestions) {
			if (q.getQuestionNumber() == questionNumber) {
				points = q.getQuestionPoints();
			}
		}
		return points;
	}

	// returns the true or false question answer
	public boolean getTrueFalseAnswer(int questionNumber) {
		boolean answer = false;
		for (Question q : examQuestions) {
			if (q.getQuestionNumber() == questionNumber) {
				answer = q.getTfAnswer();
			}
		}
		return answer;
	}

	// adds a multiple choice question to the exam by accessing the Question class
	// through the Multiple Choice question object
	public void addMultipleChoiceQuestion(int questionNumber, String text, double points, String[] answer) {
		MultipleChoice mc = new MultipleChoice(questionNumber, text, points, answer);
		Question q = mc.getQuestion();
		examQuestions.add(q);
		examPoints += q.getQuestionPoints();
	}

	// adds a true or false question to the exam by accessing the Question class
	// through the TrueFalse question object
	public void addTrueFalseQuestion(int questionNumber, String text, double points, boolean answer) {
		TrueFalse tf = new TrueFalse(questionNumber, text, points, answer);
		Question q = tf.getQuestion();
		examQuestions.add(q);
		examPoints += q.getQuestionPoints();
	}

	// adds a fill in the blanks question to the exam by accessing the Question
	// class
	// through the FallInBlank question object
	public void addFillInTheBlanksQuestion(int questionNumber, String text, double points, String[] answer) {
		FillInBlank fb = new FillInBlank(questionNumber, text, points, answer);
		Question q = fb.getQuestion();
		examQuestions.add(q);
		examPoints += q.getQuestionPoints();
	}

}
