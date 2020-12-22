package onlineTest;
import java.io.*;
public class TrueFalse extends Question implements Serializable{

	private static final long serialVersionUID = 1L;
	// calls the super Question constructor to create an Question object according
	// to the parameters
	public TrueFalse(int questionNumber, String text, double points, boolean answer) {
		super(questionNumber, text, points, null, answer);
	}
	
	//returns the True or False question from the super Question class
	public Question getQuestion() {
		return super.getQuestion();
	}
}
