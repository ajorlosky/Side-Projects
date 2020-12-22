package onlineTest;

import java.io.*;

public class FillInBlank extends Question implements Serializable {

	private static final long serialVersionUID = 1L;

	// calls the super Question constructor to create an Question object according
	// to the parameters
	public FillInBlank(int questionNumber, String text, double points, String[] answer) {
		super(questionNumber, text, points, answer, false);
	}

	//returns the FillInBlank question from the super Question class
	public Question getQuestion() {
		return super.getQuestion();
	}

}
