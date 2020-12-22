package model;

public class AnchorElement extends TagElement {
	private String linkText;
	private String url;

	// Constructor for Anchor Header Element: passes 'a' and any attributes/link
	// text to the tag element super
	public AnchorElement(String url, String linkText, String attributes) {
		super("a", true, new TextElement(linkText), attributes);
		this.url = url;
		this.linkText = linkText;
		if(attributes != null)
		{
			super.setAttributes("href=\"" + getUrlText() + "\" " + attributes);
		}
		else
		{
			super.setAttributes("href=\"" + getUrlText() + "\"");
		}
		
	}

	@Override
	public String genHTML(int indentation) {
		// generates HTML for anchor element using indentation and start/end tag in tag
		// element
		String html = Utilities.spaces(indentation);
		html += super.getStartTag();
		html += getLinkText() + super.getEndTag();
		return html;
	}

	// returns link text of anchor element
	public String getLinkText() {
		return linkText;
	}

	// returns url of anchor element
	public String getUrlText() {
		return url;
	}
}
