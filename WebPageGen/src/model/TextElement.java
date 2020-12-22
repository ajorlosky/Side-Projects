package model;

public class TextElement extends Object implements Element {
	public String text;

	// constructor for a text element (no id)
	public TextElement(String text) {
		this.text = text;
	}

	// generates the HTML for a text element
	public String genHTML(int indentation) {
		String html = "";
		html += Utilities.spaces(indentation);
		html += text;
		return (html);
	}
}
