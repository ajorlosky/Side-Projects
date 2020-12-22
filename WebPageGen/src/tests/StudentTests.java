package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.AnchorElement;
import model.ImageElement;
import model.ListElement;
import model.ParagraphElement;
import model.TableElement;
import model.TagElement;
import model.TextElement;
import model.WebPage;

public class StudentTests {

	public static final String TESTS_TAG = "\n\nEndTest";

	@Test
	public void test() {
		int indentation = 3;
		String attributes = "border=\"1\"", answer = "";
		
		TagElement.resetIds();
		TagElement.enableId(true);
		TableElement tableElement = new TableElement(2, 2, attributes);
		tableElement.addItem(0, 0, new AnchorElement("http://www.cs.umd.edu", "UMD", attributes));
		tableElement.addItem(0, 1, new TextElement("Laura"));
		tableElement.addItem(1, 0, new TextElement("Rose"));
		
		answer += tableElement.genHTML(indentation);
		answer += TESTS_TAG;
		
		System.out.print(answer);
		assertTrue(TestsSupport.isCorrect("pubTableTest1.txt", answer));
	}

}
