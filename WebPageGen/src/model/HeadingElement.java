package model;

public class HeadingElement extends TagElement {
	// constructor of heading element which passes 'h' to tag element super 
	// constructor with any attributes or content
	public HeadingElement(Element content, int level, String attributes) {
		super("h" + level, true, content, attributes);
	}
}
