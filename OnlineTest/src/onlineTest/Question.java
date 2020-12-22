package onlineTest;

import java.util.Arrays;
import java.io.*;
public class Question implements Serializable {

	private String text;
	private double points;
	private String[] arrayAnswer;
	private boolean tfAnswer;
	private int questionNumber;
	private static final long serialVersionUID = 1L;
	//constructor for an individual question, which is added to the exam arrayList
	public Question(int questionNumber, String text, double points, String[] arrayAnswer, boolean tfAnswer) {
		this.questionNumber = questionNumber;
		this.text = text;
		this.points = points;
		this.arrayAnswer = arrayAnswer;
		this.tfAnswer = tfAnswer;
	}

	//returns this reference to the current Question object
	protected Question getQuestion() {
		return this;
	}

	//returns the question number for the question
	public int getQuestionNumber() {
		return questionNumber;
	}

	//returns the amount of points a question is worth
	public double getQuestionPoints() {
		return points;
	}

	//returns an arrayAnswer (for FillBlank and Multiple Choice)
	public String[] getArrayAnswer() {
		return arrayAnswer;
	}

	//returns a boolean answer (for TrueFalse)
	public boolean getTfAnswer() {
		return tfAnswer;
	}

	//overrides toString and returns the corresponding string for the desired question stem.
	@Override
	public String toString() {
		if (arrayAnswer == null) {
			if (tfAnswer)
				return "Question Text: " + text + "\nPoints: " + points + "\nCorrect Answer: True";
			else
				return "Question Text: " + text + "\nPoints: " + points + "\nCorrect Answer: False";
		} else {
			return "Question Text: " + text + "\nPoints: " + points + "\nCorrect Answer: " + Arrays.toString(arrayAnswer);
		}
	}

}
