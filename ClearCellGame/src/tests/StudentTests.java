package tests;

import static org.junit.Assert.*;

import java.util.Random;

import model.BoardCell;
import model.ClearCellGame;
import model.Game;

import org.junit.Test;
public class StudentTests {

	public static void main(String [] args)
	{
			
		int maxRows = 4, maxCols = 5, strategy = 1;
		Game ccGame = new ClearCellGame(maxRows, maxCols, new Random(1L),
				strategy);

		ccGame.setBoardWithColor(BoardCell.YELLOW);
		ccGame.setRowWithColor(3, BoardCell.EMPTY);

		System.out.print(getBoardStr(ccGame));
		System.out.println(ccGame.getScore());
		
		ccGame.processCell(0, 0);
		System.out.println(getBoardStr(ccGame));
		System.out.print(ccGame.getScore());
	
	}
	/* Support methods */
	private static String getBoardStr(Game game) {
		int maxRows = game.getMaxRows(), maxCols = game.getMaxCols();

		String answer = "Board(Rows: " + maxRows + ", Columns: " + maxCols + ")\n";
		for (int row = 0; row < maxRows; row++) {
			for (int col = 0; col < maxCols; col++) {
				answer += game.getBoardCell(row, col).getName();
			}
			answer += "\n";
		}

		return answer;
	}
}
