package battleship;

import java.util.Scanner;

import connectFour.ConnectFour;

public class PlayGame {

	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		int again=1;
		System.out.println("Welcome to Battleship! For this game you will playing against a randomized CPU.");
		String playerName="";
		System.out.println("Enter team name: ");
		playerName = input.nextLine();
		int row=0;
		int col=0;
		boolean cont;

		while(again == 1)
		{
			Battleship game = new Battleship(playerName);
			int count = 0;
			boolean bool=false;
			System.out.println(game.getName() + "'s Initial Battleship Gameboard: ");
			game.initBoard();
			game.printOutputBoard();
			game.setBoard();
			game.setCPUBoard();
			System.out.println("Your Preset Battleship Gameboard: ");
			game.printBoard(count);
			while(!bool)
			{
				cont=true;
				count ++;
				if(count%2 == 1)
				{
					while(cont)
					{
						if(bool)
						{
							break;
						}
						System.out.println("Current CPU Battleship Gameboard: ");
						game.printOutputBoard();
						System.out.println("User turn! Select a row for the guess (0-9): ");
						row = input.nextInt();
						System.out.println("User turn! Select a column for the guess (0-9): ");
						col = input.nextInt();
						System.out.println(game.userGuess(row, col));
						cont = game.getNextPlay();
						bool = game.endGame();
					}
				}
				else if(count%2 == 0)
				{
					while(cont)
					{
						if(bool)
						{
							break;
						}
						System.out.println(game.getName() + "'s Current Battleship Gameboard: ");
						game.printMyBoard();
						row = (int) (Math.random() * 10);
						col = (int) (Math.random() * 10);
						System.out.println("CPU turn! CPU Row Guess: " + row);
						System.out.println("CPU turn! CPU Column Guess: " + col);
						System.out.println(game.CPUGuess(row, col));
						cont = game.getNextPlay();
						bool = game.endGame();
					}
				}
				
				bool = game.endGame();
			}
			if(game.checkWin())
			{
				System.out.println("Final Gameboard: " );
				game.printOutputBoard();
				System.out.println("Congrats "+ game.getName()+ " you won!");
			}
			else
			{
				System.out.println("CPU Wins!");
			}
			System.out.println("Would you like to play again? (1=yes  0=no): ");
			again = input.nextInt();
		}
		System.out.println("Thanks for playing!");
	}
}
