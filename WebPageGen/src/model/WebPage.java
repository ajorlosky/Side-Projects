package model;

import java.util.*;

public class WebPage extends Object implements Comparable<WebPage> {
	private ArrayList<Element> page;
	private String title;

	// initializes the constructor for a web page of many different elements and
	// sets the title for the page
	public WebPage(String title) {
		page = new ArrayList<Element>();
		this.title = title;
	}

	// adds element to webPage given it is a tagElement
	public int addElement(Element element) {
		page.add(element);
		if (!(element instanceof TagElement)) {
			return -1;
		} else {
			TagElement t = (TagElement) element;
			return t.getId();
		}
	}

	// generates the HTML of the webpage by initializing the head html and using a
	// for loop to get each elements html
	public String getWebPageHTML(int indentation) {
		String html = "<!doctype html>\n<html>\n";

		// Head
		html += Utilities.defaultSpaces(1) + "<head>\n";
		html += Utilities.defaultSpaces(1) + Utilities.spaces(indentation) + "<meta charset=\"utf-8\"/>\n";
		html += Utilities.defaultSpaces(1) + Utilities.spaces(indentation) + "<title>" + title + "</title>\n";
		html += Utilities.defaultSpaces(1) + "</head>\n";

		// body
		html += Utilities.defaultSpaces(1) + "<body>\n";
		for (Element e : page) {
			html += e.genHTML(indentation) + "\n";
		}
		html += Utilities.defaultSpaces(1) + "</body>\n";
		html += "</html>";
		return (html);
	}

	// writes the HTML to a webpage file
	public void writeToFile(String filename, int indentation) {
		Utilities.writeToFile(filename, getWebPageHTML(indentation));
	}

	// finds an element in the webpage based on its id
	public Element findElem(int id) {
		for (Element e : page) {
			TagElement tag = (TagElement) e;
			if (id == tag.getId()) {
				return e;
			}
		}
		return null;
	}

	// returns the stats of the webage: # of tables, lists, paragraphs, and table
	// utilization
	public String stats() {
		String stats = "";
		int lists = 0;
		int tables = 0;
		int paragraphs = 0;
		double utilization = 0.0;
		for (Element p : page) {
			if (p instanceof ListElement) {
				lists += 1;
			} else if (p instanceof TableElement) {
				tables += 1;
				utilization += ((TableElement) p).getTableUtilization();
			} else if (p instanceof ParagraphElement) {
				paragraphs += 1;
			}
		}
		stats += "List Count: " + lists;
		stats += "\nParagraph Count: " + paragraphs;
		stats += "\nTable Count: " + tables;
		stats += "\nTableElement Utilization: " + utilization / tables;
		return stats;
	}

	// compare to for two webPages
	public int compareTo(WebPage webPage) {
		if (this.title.compareTo(webPage.title) < 0) {
			return -1;
		} else if (this.title.compareTo(webPage.title) == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	// changes id on or off from webPage based on choice
	public static void enableId(boolean choice) {
		TagElement.enableId(choice);
	}
}
