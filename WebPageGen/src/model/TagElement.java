package model;

public class TagElement implements Element {
	private static boolean keepId = false;
	private static int id;
	private String attributes;
	protected String tagName;
	private Element content;
	private boolean endTag = true;

	// constructor for any HTML tag and specifies the tag display, content, name,
	// and attributes
	public TagElement(String tagName, boolean endTag, Element content, String attributes) {
		this.tagName = tagName;
		this.content = content;
		this.attributes = attributes;
		this.endTag = endTag;
	}

	// returns the tags current id
	public int getId() {
		return id;
	}

	// returns a string with the tagName and id
	public String getStringId() {
		return tagName + " id=\"" + tagName + id + "\"";
	}

	// returns the start tag with either the id or not (and attributes or not)
	public String getStartTag() {
		String startTag;
		if (keepId) {
			if (attributes != null) {
				startTag = "<" + getStringId() + " " + attributes + ">";
			} else {
				startTag = "<" + getStringId() + ">";

			}
			id++;
		} else {
			if (attributes != null) {
				startTag = "<" + tagName + " " + attributes + ">";
			} else {
				startTag = "<" + tagName + ">";

			}
		}

		return startTag;
	}

	// return the end tag name with no id or attributes
	public String getEndTag() {
		if (endTag) {
			{
				return "</" + tagName + ">";
			}
		} else {
			return "";
		}

	}

	// sets the attributes of an id tag
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	// resets the id count to 1
	public static void resetIds() {
		id = 1;
	}

	// generates the html of a tag (start, html of text, and end) for those without
	// an overriden method
	public String genHTML(int indentation) {
		String html = "";
		html += Utilities.spaces(indentation);
		html += getStartTag();
		if (content != null) {
			html += content.genHTML(indentation);
		}
		html += getEndTag();
		return (html);
	}

	// sets keepID (on or off) to choice
	public static void enableId(boolean choice) {
		keepId = choice;
	}
}
