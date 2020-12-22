package battleship;
import java.util.Scanner;
public class Battleship {

	private String [][] myGameBoard = new String [10] [10];
	private String [][] CPUGameBoard = new String [10] [10];
	private String [][] outputGameBoard = new String [10] [10];
	private Player one; 
	private Player two;
	private String gameWon;
	private boolean cont;
	private String p1Name;
	private String cpuName;
	private int myCount;
	private int CPUCount;

	Scanner input = new Scanner(System.in);
	public Battleship(String p1)
	{
		p1Name = p1;
		cpuName = "CPU";
		one = new Player(p1Name);
		two = new Player(cpuName);
		for(int i=0;i<outputGameBoard.length; i++)
		{
			for(int j=0; j<outputGameBoard[0].length; j++)
			{
				outputGameBoard[i][j] = "-";
			}
		}
	}
	public void setBoard()
	{
		int n = 0;
		int col = 0;
		int row = 0;
		int length = 0;
		String letter = "";
		String orientation="";
		System.out.println("For this game you will have to place the following ships: \n" + "Carrier: 5 holes \n" + "Battleship: 4 holes \n" + "Cruiser: 3 holes \n" + "Submarine: 3 holes \n" + "Destroyer: 2 holes \n");
		System.out.println("You CANNOT place any ship diagonally! 	And ships should not overlap!");
		while(n < 5)
		{
			if(n==0)
			{
				length = 5;
				letter = "C";
				System.out.println("Setting the location of the Carrier (Enter v = vertical / h = horizontal): ");
				orientation = input.nextLine();
				if(orientation.equals("v"))
				{
					System.out.println("Enter the column of the carrier (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the row of the top of the carrier (0-9): ");
					row = input.nextInt();
				}
				else if(orientation.equals("h"))
				{
					System.out.println("Enter the row of the carrier (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the col of the left of the carrier (0-9): ");
					row = input.nextInt();
				}
			}
			else if(n==1)
			{
				length = 4;
				letter = "B";
				System.out.println("Setting the location of the Battleship (Enter v = vertical / h = horizontal): ");
				orientation = input.next();
				if(orientation.equals("v"))
				{
					System.out.println("Enter the column of the battleship (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the row of the top of the battleship (0-9): ");
					row = input.nextInt();
				}
				else if(orientation.equals("h"))
				{
					System.out.println("Enter the row of the battleship (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the col of the left of the battleship (0-9): ");
					row = input.nextInt();
				}
			}
			else if(n==2)
			{
				length = 3;
				letter = "c";
				System.out.println("Setting the location of the Cruiser (Enter v = vertical / h = horizontal): ");
				orientation = input.next();
				if(orientation.equals("v"))
				{
					System.out.println("Enter the column of the cruiser (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the row of the top of the cruiser (0-9): ");
					row = input.nextInt();
				}
				else if(orientation.equals("h"))
				{
					System.out.println("Enter the row of the cruiser (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the col of the left of the cruiser (0-9): ");
					row = input.nextInt();
				}
			}
			else if(n==3)
			{
				length = 3;
				letter = "S";
				System.out.println("Setting the location of the Submarine (Enter v = vertical / h = horizontal): ");
				orientation = input.next();
				if(orientation.equals("v"))
				{
					System.out.println("Enter the column of the submarine (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the row of the top of the submarine (0-9): ");
					row = input.nextInt();
				}
				else if(orientation.equals("h"))
				{
					System.out.println("Enter the row of the submarine (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the col of the left of the submarine (0-9): ");
					row = input.nextInt();
				}
			}
			else if(n==4)
			{
				length = 2;
				letter = "D";
				System.out.println("Setting the location of the Destroyer (Enter v = vertical / h = horizontal): ");
				orientation = input.next();
				if(orientation.equals("v"))
				{
					System.out.println("Enter the column of the destroyer (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the row of the top of the destroyer (0-9): ");
					row = input.nextInt();
				}
				else if(orientation.equals("h"))
				{
					System.out.println("Enter the row of the destroyer (0-9): ");
					col = input.nextInt();
					System.out.println("Enter the col of the left of the destroyer (0-9): ");
					row = input.nextInt();
				}
			}
			if(orientation.equals("v"))
			{
				for(int i = row; i< length +row; i++)
				{
					myGameBoard[i][col] = letter;
				}
			}
			else if(orientation.equals("h"))
			{
				for(int i = col; i< length + col; i++)
				{
					myGameBoard[row][i] = letter;
				}
			}
			n++;
		}
	}
	public void setCPUBoard()
	{
		int randCol;
		int randRow;
		int orient;
		int length=0;
		String letter="";
		boolean check=true;
		for(int i = 0; i<5; i++)
		{
			orient = (int) (Math.random() * 2);
			if(i ==0)
			{
				length = 5;
				letter = "C";
			}
			if(i ==1)
			{
				length = 4;
				letter = "B";

			}
			if(i ==2)
			{
				length = 3;
				letter = "c";
			}
			if(i ==3)
			{
				length = 3;
				letter = "S";
			}
			if(i ==4)
			{
				length = 2;
				letter = "D";
			}
			randCol=0;
			randRow=0;
			if(orient == 0)//horizontal
			{
				check=true;
				while(check)
				{
					randCol = (int) (Math.random() * 10); 
					randRow = (int) (Math.random() * 10);
					if(randCol + length-1 < 9)
					{
						for(int j = randCol; j < randCol + length; j++)
						{
							if(CPUGameBoard[randRow][j].equals("C") || CPUGameBoard[randRow][j].equals("B") || CPUGameBoard[randRow][j].equals("c") || CPUGameBoard[j][randCol].equals("S") ||CPUGameBoard[j][randCol].equals("D"))
							{
								check = true;
								break;
							}
							else
							{
								check = false;
							}
						}
					}
				}
				for(int k = randCol; k < randCol + length; k++)
				{
					CPUGameBoard[randRow][k] = letter;
				}
			}
			else if(orient == 1)//vertical
			{
				check=true;
				while(check)
				{
					randCol = (int) (Math.random() * 10); 
					randRow = (int) (Math.random() * 10);
					if(randRow + length-1 <9)
					{
						for(int j = randRow; j < randRow + length; j++)
						{
							if(CPUGameBoard[j][randCol].equals("C") || CPUGameBoard[j][randCol].equals("B") || CPUGameBoard[j][randCol].equals("c") || CPUGameBoard[j][randCol].equals("S") ||CPUGameBoard[j][randCol].equals("D") )
							{
								check = true;
								break;
							}
							else
							{
								check = false;
							}
						}
					}
				}
				for(int k = randRow; k < randRow + length; k++)
				{
					CPUGameBoard[k][randCol] = letter;
				}
			}
		}
		for(int i=0;i<CPUGameBoard.length; i++)
		{
			for(int j=0; j<CPUGameBoard[0].length; j++)
			{
				System.out.print(CPUGameBoard[i][j]);
			}
			System.out.println();
		}
		
	}
	public String getName()
	{
		return one.getName();
	}
	public String CPUGuess(int r, int c)
	{
		String message ="";
		if(myGameBoard[r][c].equals("-"))
		{
			message = "That's a miss!";
			myGameBoard[r][c] = "o";
			cont = false;
		}
		else if(myGameBoard[r][c].equals("x"))
		{
			message = "Already hit a ship here! Guess again";
			cont = true;
		}	
		else if(myGameBoard[r][c].equals("C"))
		{
			message = "That's a hit! CPU hit the carrier!";
			myGameBoard[r][c] = "x";
			cont = true;
		}
		else if(myGameBoard[r][c].equals("B"))
		{
			message = "That's a hit! CPU hit the battleship!";
			myGameBoard[r][c] = "x";
			cont = true;
		}
		else if(myGameBoard[r][c].equals("c"))
		{
			message = "That's a hit! CPU hit the cruiser!";
			myGameBoard[r][c] = "x";
			cont = true;
		}
		else if(myGameBoard[r][c].equals("S"))
		{
			message = "That's a hit! CPU hit the submarine!";
			myGameBoard[r][c] = "x";
			cont = true;
		}
		else if(myGameBoard[r][c].equals("D"))
		{
			message = "That's a hit! CPU hit the destroyer!";
			myGameBoard[r][c] = "x";
			cont = true;
		}
		return message;
	}
	public String userGuess(int r, int c)
	{
		String message ="";
		if(CPUGameBoard[r][c].equals("-"))
		{
			message = "That's a miss!";
			outputGameBoard[r][c] = "o";
			cont = false;
		}
		else if(CPUGameBoard[r][c].equals("x"))
		{
			message = "Already hit a ship here! Guess again";
			cont = true;
		}	
		else if(CPUGameBoard[r][c].equals("C"))
		{
			message = "That's a hit! You hit the carrier!";
			CPUGameBoard[r][c] = "x";
			outputGameBoard[r][c] = "C";
			cont = true;
		}
		else if(CPUGameBoard[r][c].equals("B"))
		{
			message = "That's a hit! You hit the battleship!";
			CPUGameBoard[r][c] = "x";
			outputGameBoard[r][c] = "B";
			cont = true;
		}
		else if(CPUGameBoard[r][c].equals("c"))
		{
			message = "That's a hit! You hit the cruiser!";
			CPUGameBoard[r][c] = "x";
			outputGameBoard[r][c] = "c";
			cont = true;
		}
		else if(CPUGameBoard[r][c].equals("S"))
		{
			message = "That's a hit! You hit the submarine!";
			CPUGameBoard[r][c] = "x";
			outputGameBoard[r][c] = "S";
			cont = true;
		}
		else if(CPUGameBoard[r][c].equals("D"))
		{
			message = "That's a hit! You hit the destroyer!";
			CPUGameBoard[r][c] = "x";
			outputGameBoard[r][c] = "D";
			cont = true;
		}
		return message;
	}
	public boolean getNextPlay()
	{
		return cont;
	}
	public void printOutputBoard()
	{
		for(int i=0;i<outputGameBoard.length; i++)
		{
			for(int j=0; j<outputGameBoard[0].length; j++)
			{
				System.out.print(outputGameBoard[i][j]);
			}
			System.out.println();

		}
	}
	public void printMyBoard()
	{
		for(int i=0;i<myGameBoard.length; i++)
		{
			for(int j=0; j<myGameBoard[0].length; j++)
			{
				System.out.print(myGameBoard[i][j]);
			}
			System.out.println();

		}
	}
	public void initBoard()
	{
		for(int i=0; i<myGameBoard.length; i++)
		{
			for(int j=0; j<myGameBoard[0].length; j++)
			{
				myGameBoard[i][j] = "-";
				CPUGameBoard[i][j] = "-";
				outputGameBoard[i][j] = "-";
			}
		}
	}
	public boolean endGame()
	{
		myCount=0;
		CPUCount=0;
		for(int i = 0; i< CPUGameBoard.length; i++)
		{
			for(int j = 0; j<CPUGameBoard[0].length; j++)
			{
				if(CPUGameBoard[i][j].equals("x"))
				{
					myCount++;
				}
			}
		}
		for(int i = 0; i< myGameBoard.length; i++)
		{
			for(int j = 0; j<myGameBoard[0].length; j++)
			{
				if(myGameBoard[i][j].equals("x"))
				{
					CPUCount++;
				}
			}
		}
		if(myCount == 17 || CPUCount == 17)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean checkWin()
	{
		if(myCount==17)
		{
			return true;
		}
		else{
			return false;
		}
	}
	public void printBoard(int c)
	{
		if(c%2==1)
		{
			for(int i=0; i<CPUGameBoard.length; i++)
			{
				for(int j=0; j<CPUGameBoard[0].length; j++)
				{
					System.out.print(CPUGameBoard[i][j]);
				}
				System.out.println();
			}
		}
		else if(c%2==0)
		{
			for(int i=0; i<myGameBoard.length; i++)
			{
				for(int j=0; j<myGameBoard[0].length; j++)
				{
					System.out.print(myGameBoard[i][j]);
				}
				System.out.println();
			}
		}
		
		
	}
}
