package model;

public class TableElement extends TagElement {
	private Element[][] table;

	// constructor for table <table> element using super and initializes the
	// 2d-array of elements using correct rows/cols
	public TableElement(int rows, int cols, String attributes) {
		super("table", true, null, attributes);
		table = new Element[rows][cols];
	}

	// adds an item to the table at the col and row
	public void addItem(int rowIndex, int colIndex, Element item) {
		table[rowIndex][colIndex] = item;
	}

	// gets the utilization percent of table(s) by searing a for-each and counting
	// the total cells and num of objects in all of the tables
	public double getTableUtilization() {
		double num = 0;
		double total = (table.length * table[0].length);
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (table[i][j] != null) {
					num++;
				}
			}
		}
		double percent = num / total;
		return percent * 100;
	}

	// returns the HTML for the table by using a for each loop to access the HTML of
	// each cell (using appropriate tags)
	@Override
	public String genHTML(int indentation) {
		String tblHTML = "";
		tblHTML += Utilities.defaultSpaces(1) + super.getStartTag() + "\n";
		for (int i = 0; i < table.length; i++) {
			tblHTML += Utilities.defaultSpaces(1) + Utilities.spaces(indentation) + "<tr>";
			for (int j = 0; j < table[i].length; j++) {
				tblHTML += "<td>";
				if (table[i][j] != null) {
					tblHTML += table[i][j].genHTML(0);
				}
				tblHTML += "</td>";
			}
			tblHTML += "</tr>\n";
		}
		tblHTML += Utilities.defaultSpaces(1) + super.getEndTag();

		return tblHTML;

	}
}
