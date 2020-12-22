package connectFour;

import java.util.Scanner;

public class PlayGame {

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int again=1;
		System.out.println("Welcome to Connect Four!");
		String player1="";
		String player2="";
		System.out.println("Enter blue player team name: ");
		player1 = input.nextLine();
		System.out.println("Enter red player team name: ");
		player2 = input.nextLine();
		while(again == 1)
		{
			ConnectFour game = new ConnectFour(player1, player2);
			int count = 0;
			boolean bool=false;
			while(!bool)
			{
				System.out.println("Current Connect Four Gameboard: ");
				game.printBoard(count);
				game.playGame(count);
				count++;
				bool = game.checkGameIsWon();
			}
			game.printBoard(count);
			System.out.println(game.gameWinner());
			
			System.out.println("Would you like to play again? (1=yes  0=no): ");
			again = input.nextInt();
		}
		System.out.println("Thanks for playing!");
		
		
	}
}
