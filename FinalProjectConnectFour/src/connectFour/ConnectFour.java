package connectFour;
import java.util.Scanner;
public class ConnectFour {

	private String [][] gameBoard = new String [6] [7];
	private Player one; 
	private Player two;
	private int column;
	private String gameWon;
	private String p1Name;
	private String p2Name;

	Scanner input = new Scanner(System.in);
	public ConnectFour(String p1, String p2)
	{
		p1Name = p1;
		p2Name = p2;
		one = new Player(p1, "blue");
		two = new Player(p2, "red");
	}
	public String gameWinner()
	{
		String output = "";
		if(gameWon.equals("B"))
		{
			output = "Congrats " + p1Name + "! You win Connect Four!";
		}
		else if(gameWon.equals("R"))
		{
			output = "Congrats " + p2Name + "! You win Connect Four!";
		}
		return output;
	}
	public boolean checkGameIsWon()
	{
		boolean check = false;
		for(int i = 0; i<gameBoard.length; i++)
		{
			for(int j = 0; j<gameBoard[0].length; j++)
			{
				if(gameBoard[i][j].equals("R"))
				{
					if(i==0 && j==0)
					{
						if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==0 && j==1)
					{
						if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==0 && j==2)
					{
						if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==0 && j==3)
					{
						if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==0 && j==4)
					{
						if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==0 && j==5)
					{
						if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==0 && j==6)
					{
						if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==1 && j==0)
					{
						if(gameBoard[i-1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==1 && j==1)
					{
						if(gameBoard[i-1][j-1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==1 && j==2)
					{
						if(gameBoard[i-1][j-1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==1 && j==3)
					{
						if(gameBoard[i-1][j-1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+3][j-3].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==1 && j==4)
					{
						if(gameBoard[i-1][j-1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+3][j-3].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==1 && j==5)
					{
						if(gameBoard[i-1][j+1].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+3][j-3].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==1 && j==6)
					{
						if(gameBoard[i+3][j-3].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==2 && j==0)
					{
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==2 && j==1)
					{
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==2 && j==2)
					{
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==2 && j==3)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i+3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+3][j-3].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==2 && j==4)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+3][j-3].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==2 && j==5)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+3][j-3].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==2 && j==6)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R") && gameBoard[i+3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i+3][j-3].equals("R") && gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==3 && j==0)
					{
						//UPDOWN
						if(gameBoard[i-3][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==3 && j==1)
					{
						//UPDOWN
						if(gameBoard[i-3][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==3 && j==2)
					{
						//UPDOWN
						if(gameBoard[i-3][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-3][j+3].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==3 && j==3)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i-3][j+3].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==3 && j==4)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i+2][j+2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==3 && j==5)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+2][j-2].equals("R") && gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==3 && j==6)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R") && gameBoard[i+2][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==4 && j==0)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+3].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==4 && j==1)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-1][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+3].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+2].equals("R") && gameBoard[i][j+1].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==4 && j==2)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-3][j+3].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+3].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+2].equals("R") && gameBoard[i][j+1].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==4 && j==3)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j-1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-3][j+3].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+3].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+2].equals("R") && gameBoard[i][j+1].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==4 && j==4)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j-1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+1][j-1].equals("R") && gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+2].equals("R") && gameBoard[i][j+1].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==4 && j==5)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j-1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j+1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==4 && j==6)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("R") && gameBoard[i-1][j].equals("R") && gameBoard[i+1][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-3][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j-1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==5 && j==0)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==5 && j==1)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==5 && j==2)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==5 && j==3)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-3][j-3].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("R") && gameBoard[i-2][j+2].equals("R") && gameBoard[i-3][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j+3].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==5 && j==4)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-3][j-3].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j+2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==5 && j==5)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-3][j-3].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					else if(i==5 && j==6)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("R") && gameBoard[i-2][j].equals("R") && gameBoard[i-3][j].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-3][j-3].equals("R") && gameBoard[i-2][j-2].equals("R") && gameBoard[i-1][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j-3].equals("R") && gameBoard[i][j-2].equals("R") && gameBoard[i][j-1].equals("R"))
						{
							gameWon = "R";
							check = true;
						}
					}
					
					
				}
				else if(gameBoard[i][j].equals("B"))
				{
					if(i==0 && j==0)
					{
						if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+2].equals("B"))
						{
							gameWon = "B";
							check = false;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = false;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = false;
						}
					}
					else if(i==0 && j==1)
					{
						if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==0 && j==2)
					{
						if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==0 && j==3)
					{
						if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==0 && j==4)
					{
						if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==0 && j==5)
					{
						if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==0 && j==6)
					{
						if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==1 && j==0)
					{
						if(gameBoard[i-1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==1 && j==1)
					{
						if(gameBoard[i-1][j-1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==1 && j==2)
					{
						if(gameBoard[i-1][j-1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==1 && j==3)
					{
						if(gameBoard[i-1][j-1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+3][j-3].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==1 && j==4)
					{
						if(gameBoard[i-1][j-1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+3][j-3].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==1 && j==5)
					{
						if(gameBoard[i-1][j+1].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+3][j-3].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==1 && j==6)
					{
						if(gameBoard[i+3][j-3].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==2 && j==0)
					{
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==2 && j==1)
					{
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==2 && j==2)
					{
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==2 && j==3)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i+3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+3][j-3].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==2 && j==4)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+3][j-3].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==2 && j==5)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+3][j-3].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==2 && j==6)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B") && gameBoard[i+3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i+3][j-3].equals("B") && gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==3 && j==0)
					{
						//UPDOWN
						if(gameBoard[i-3][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==3 && j==1)
					{
						//UPDOWN
						if(gameBoard[i-3][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==3 && j==2)
					{
						//UPDOWN
						if(gameBoard[i-3][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-3][j+3].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==3 && j==3)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i-3][j+3].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==3 && j==4)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i+2][j+2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==3 && j==5)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+2][j-2].equals("B") && gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==3 && j==6)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B") && gameBoard[i+2][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==4 && j==0)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+3].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==4 && j==1)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-1][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+3].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+2].equals("B") && gameBoard[i][j+1].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==4 && j==2)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-3][j+3].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+3].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+2].equals("B") && gameBoard[i][j+1].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==4 && j==3)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j-1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-3][j+3].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+3].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+2].equals("B") && gameBoard[i][j+1].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==4 && j==4)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j-1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i+1][j-1].equals("B") && gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+2].equals("B") && gameBoard[i][j+1].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==4 && j==5)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i+1][j+1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j-1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j+1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==4 && j==6)
					{
						//UPDOWN
						if(gameBoard[i-2][j].equals("B") && gameBoard[i-1][j].equals("B") && gameBoard[i+1][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-1][j-1].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-3][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j-1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==5 && j==0)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==5 && j==1)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==5 && j==2)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==5 && j==3)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-3][j-3].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						else if(gameBoard[i-1][j+1].equals("B") && gameBoard[i-2][j+2].equals("B") && gameBoard[i-3][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j+3].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==5 && j==4)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-3][j-3].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j+2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==5 && j==5)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-3][j-3].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j+1].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}
					else if(i==5 && j==6)
					{
						//UPDOWN
						if(gameBoard[i-1][j].equals("B") && gameBoard[i-2][j].equals("B") && gameBoard[i-3][j].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG RIGHT
						else if(gameBoard[i-3][j-3].equals("B") && gameBoard[i-2][j-2].equals("B") && gameBoard[i-1][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
						//DIAG LEFT
						//LEFT/RIGHT
						else if(gameBoard[i][j-3].equals("B") && gameBoard[i][j-2].equals("B") && gameBoard[i][j-1].equals("B"))
						{
							gameWon = "B";
							check = true;
						}
					}

				}
			}
		}
		return check;
	}
	public void playGame(int c)
	{
		if(c%2 == 0)
		{
			System.out.println(one.getProfile());
			System.out.println("Select a column to place a " + one.getColor() + " gamepiece (0-6): ");
			column = input.nextInt();
			for(int i = gameBoard.length-1; i>=0 ; i--)
			{
				if(gameBoard[i][column].equals("-"))
				{
					gameBoard[i][column] = "B";
					break;
				}
			}
		}
		else
		{
			System.out.println(two.getProfile());
			System.out.println("Select a column to place a " + two.getColor() + " gamepiece (0-6): ");
			column = input.nextInt();
			for(int i = gameBoard.length-1; i>=0 ; i--)
			{
				if(gameBoard[i][column].equals("-"))
				{
					gameBoard[i][column] = "R";
					break;
				}
			}
		}
	}
	public void printBoard(int c)
	{
		if(c==0)
		{
			for(int i=0; i<gameBoard.length; i++)
			{
				for(int j=0; j<gameBoard[0].length; j++)
				{
					gameBoard[i][j] = "-";
				}
			}
		}
		for(int i=0; i<gameBoard.length; i++)
		{
			for(int j=0; j<gameBoard[0].length; j++)
			{
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
}
