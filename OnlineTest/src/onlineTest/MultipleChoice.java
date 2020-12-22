package onlineTest;

import java.io.*;

public class MultipleChoice extends Question implements Serializable {

	private static final long serialVersionUID = 1L;
	// calls the super Question constructor to create an Question object according
	// to the parameters
	public MultipleChoice(int questionNumber, String text, double points, String[] answer) {
		super(questionNumber, text, points, answer, false);
	}

	//returns the Multiple Choice question from the super Question class
	public Question getQuestion() {
		return super.getQuestion();
	}
}
