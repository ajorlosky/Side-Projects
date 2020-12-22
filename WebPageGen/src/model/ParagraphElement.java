package model;

import java.util.ArrayList;

public class ParagraphElement extends TagElement {
	private ArrayList<Element> items = new ArrayList<Element>();

	// constructor for 'p' paragraph element tag and passes any attributes to super
	// tag
	public ParagraphElement(String attributes) {
		super("p", true, null, attributes);
	}

	// adds an item to the arrayList of items in the paragraph
	public void addItem(Element item) {
		items.add(item);
	}

	// generates the HTML for a paragraph using for-each loop through the arrayList
	// of elements
	@Override
	public String genHTML(int identation) {
		String html = Utilities.defaultSpaces(1);
		html += super.getStartTag() + "\n";
		for (Element e : items) {
			html += e.genHTML(6);
			html += "\n";
		}
		html += Utilities.defaultSpaces(1) + "</p>";
		return html;
	}
}
