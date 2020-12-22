package model;

import java.awt.*;
import java.util.Random;

/**
 * This enumerated type represents a board cell. A board cell has a color (based
 * on Color) and a name (e.g., "R").
 * 
 * @author Dept of Computer Science, UMCP
 */

public enum BoardCell {
	RED(Color.RED, "R"), GREEN(Color.GREEN, "G"), BLUE(Color.BLUE, "B"), YELLOW(Color.YELLOW, "Y"),
	EMPTY(Color.WHITE, ".");

	private final Color color;
	private final String name;
	private static int totalColors = BoardCell.values().length;

	// initializes a boardCell element with a given name and color
	private BoardCell(Color color, String name) {
		this.color = color;
		this.name = name;
	}

	// returns the color of the board cell
	public Color getColor() {
		return color;
	}

	// returns the name of the board cell
	public String getName() {
		return name;
	}

	// returns the total amount of colors in the BoardCell values
	public static int getTotalColors() {
		return totalColors;
	}

	/**
	 * Generates a random BoardCell using the specified Random object.
	 * 
	 * @param random
	 * @return random BoardCell
	 */
	public static BoardCell getNonEmptyRandomBoardCell(Random random) {
		int target = random.nextInt(totalColors);
		for (BoardCell boardCell : BoardCell.values()) {
			if (boardCell == BoardCell.EMPTY)
				return BoardCell.RED;
			if (target == boardCell.ordinal())
				return boardCell;
		}
		throw new IllegalArgumentException("Invalid random number generated");
	}
}