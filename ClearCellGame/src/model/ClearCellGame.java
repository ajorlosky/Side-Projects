package model;

import java.util.Random;

/* This class must extend Game */
public class ClearCellGame extends Game {

	private Random random;
	private int strategy;
	public int score = 0;

	// constructor which initializes the board using the super to game class and it
	// assigns random/strategy to appropriate fields
	public ClearCellGame(int maxRows, int maxCols, Random random, int strategy) {
		super(maxRows, maxCols);
		this.random = random;
		this.strategy = strategy;
	}

	// checks if the Game is over by checking if the final row has a BoardCell item.
	// If so, it returns true. If all empty, it return false and the game continues.
	public boolean isGameOver() {
		int row = super.getMaxRows() - 1;
		for (int i = 0; i < super.getMaxCols(); i++) {
			if (super.getBoardCell(row, i) != BoardCell.EMPTY) {
				return true;
			}
		}
		return false;
	}

	// returns the current score of the game
	public int getScore() {
		return score;
	}

	// if the game is not over, the game will proceed by shifting all rows down
	// starting at the bottom of the board and inserting a random row and index 0.
	public void nextAnimationStep() {
		if (!isGameOver()) {
			for (int row = super.getMaxRows() - 2; row >= 0; row--) {
				for (int col = super.getMaxCols() - 1; col >= 0; col--) {
					super.setBoardCell(row + 1, col, super.getBoardCell(row, col));
				}
			}
			for (int c = 0; c < super.getMaxCols(); c++) {
				super.setBoardCell(0, c, BoardCell.getNonEmptyRandomBoardCell(random));
			}
		}
	}

	// if the game is not over, process cell checks if boardCell elements in the
	// board in all vertical, horizontal, and diagonal directions have the same
	// color as Board cell with the given index
	public void processCell(int rowIndex, int colIndex) {

		if (!isGameOver() && super.getBoardCell(rowIndex, colIndex) != BoardCell.EMPTY && strategy == 1) {

			// sets the given BoardCell enum to empty and updates the score
			BoardCell color = super.getBoardCell(rowIndex, colIndex);
			super.setBoardCell(rowIndex, colIndex, BoardCell.EMPTY);
			score++;

			// checks in all directions for BoardCell's with the same color. If so, it sets
			// the element to empty and updates the score.
			// check Horizontal (left)
			for (int col = colIndex - 1; col >= 0; col--) {
				if (super.getBoardCell(rowIndex, col).getColor() == color.getColor()) {
					super.setBoardCell(rowIndex, col, BoardCell.EMPTY);
					score++;
				} else {
					break;
				}
			}

			// check Horizontal (right)
			for (int col = colIndex + 1; col < super.getMaxCols(); col++) {
				if (super.getBoardCell(rowIndex, col).getColor() == color.getColor()) {
					super.setBoardCell(rowIndex, col, BoardCell.EMPTY);
					score++;
				} else {
					break;
				}
			}

			// check Vertical (up)
			for (int row = rowIndex - 1; row >= 0; row--) {
				if (super.getBoardCell(row, colIndex).getColor() == color.getColor()) {
					super.setBoardCell(row, colIndex, BoardCell.EMPTY);
					score++;
				} else {
					break;
				}
			}
			// check Vertical (down)
			for (int row = rowIndex + 1; row < super.getMaxRows(); row++) {
				if (super.getBoardCell(row, colIndex).getColor() == color.getColor()) {
					super.setBoardCell(row, colIndex, BoardCell.EMPTY);
					score++;
				} else {
					break;
				}
			}

			int rowCheck = rowIndex;
			// check Diagonal (up/right)
			for (int col = colIndex + 1; col < super.getMaxCols(); col++) {
				rowCheck--;
				if (rowCheck >= 0 && super.getBoardCell(rowCheck, col).getColor() == color.getColor()) {
					super.setBoardCell(rowCheck, col, BoardCell.EMPTY);
					score++;
				} else {
					break;
				}
			}

			// check Diagonal (up/left)
			rowCheck = rowIndex;
			for (int col = colIndex - 1; col >= 0; col--) {
				rowCheck--;
				if (rowCheck >= 0 && super.getBoardCell(rowCheck, col).getColor() == color.getColor()) {
					super.setBoardCell(rowCheck, col, BoardCell.EMPTY);
					score++;
				} else {
					break;
				}
			}

			// check Diagonal (down/right)
			rowCheck = rowIndex;
			for (int col = colIndex + 1; col < super.getMaxCols(); col++) {
				rowCheck++;
				if (rowCheck < super.getMaxRows() && super.getBoardCell(rowCheck, col).getColor() == color.getColor()) {
					super.setBoardCell(rowCheck, col, BoardCell.EMPTY);
					score++;
				} else {
					break;
				}
			}

			// check Diagonal (down/left)
			rowCheck = rowIndex;
			for (int col = colIndex - 1; col >= 0; col--) {
				rowCheck++;
				if (rowCheck < super.getMaxRows() && super.getBoardCell(rowCheck, col).getColor() == color.getColor()) {
					super.setBoardCell(rowCheck, col, BoardCell.EMPTY);
					score++;
				} else {
					break;
				}
			}
		}
		// checks the board for empty rows and shift the board up rows according
		fixBoard();
	}

	// shifts the board up if there is an empty row(s). Starts from the bottom and
	// shifts all rows below and empty row upwards.
	private void fixBoard() {
		boolean check;
		for (int row = super.getMaxRows() - 2; row >= 0; row--) {
			check = false;
			for (int col = 0; col < super.getMaxCols(); col++) {
				if (super.getBoardCell(row, col) != BoardCell.EMPTY) {
					check = true;
					break;
				}
			}
			if (!check) {
				for (int r = row; r < super.getMaxRows() - 1; r++) {
					for (int c = 0; c < super.getMaxCols(); c++) {
						super.setBoardCell(r, c, board[r + 1][c]);
					}
				}
			}
		}
	}
}