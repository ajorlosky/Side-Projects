package model;

public class ImageElement extends TagElement {
	private String url;
	public String imageSource;

	// constructor for 'img' tag element: passes src, width, height, url, 
	// and attributes to tag through super call
	public ImageElement(String imageURL, int width, int height, String alt, String attributes) {
		super("img", false, null, attributes);
		url = imageURL;
		super.setAttributes("src=\"" + getImageURL() + "\"" + " width=\"" + width + "\"" + " height=\"" + height + "\""
				+ " alt=\"" + alt + "\"");
	}

	// returns url of the image
	public String getImageURL() {
		return url;
	}
}
