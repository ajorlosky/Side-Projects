package model;

import java.util.*;

public class ListElement extends TagElement {
	public ArrayList<Element> list = new ArrayList<Element>();

	// constructor for unordered 'ul' and ordered 'ol' lists: passes attributes and
	// tagName to super
	public ListElement(boolean ordered, String attributes) {
		super("ul", true, null, attributes);
		if (ordered) {
			super.tagName = "ol";
		}
	}

	// adds item to array list of elements to appear in list
	public void addItem(Element item) {
		list.add(item);
	}

	// generates HTML for ordered and unordered list by calling start/end tag and
	// using for-each to access each element html in the list
	@Override
	public String genHTML(int indentation) {
		String html = Utilities.defaultSpaces(1) + super.getStartTag() + "\n";
		for (Element e : list) {
			html += Utilities.spaces(indentation + 3) + "<li>\n";
			html += e.genHTML(indentation + 6);
			html += "\n" + Utilities.spaces(indentation + 3) + "</li>\n";
		}
		html += Utilities.defaultSpaces(1) + super.getEndTag();
		return html;

	}
}
