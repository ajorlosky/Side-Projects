/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/8/18
 *DRPlayer.java
 *Object class for the player
 *This program will prompt the user for the amount of points that they want to risk, their call (high or low), and it will give that information to client code
 */
package diceRoll;
import java.util.Scanner;
public class DRPlayer {

	Die die1 = new Die();//creates a die1 variable in the Die object class
	Die die2 = new Die();//creates a die2 variable in the Die object class
	
	private int points;
	private int risk;
	private int userChoice;
	private int total;
	
	Scanner input= new Scanner (System.in);
	public int RiskPoints(int p)//asks the user for the number of points he or she wants to risk, asks for their call, and adds the total of two randomly rolled dice
	{
			points = p;
			System.out.println("How many points do you want to risk? (-1 to quit): ");//asks the user for the number of points he or she wants to risk
			risk = input.nextInt();
			if(risk>points)//checks to make sure the user did not risk more than he or she had
			{
				System.out.println("You risked more points than you have. Please risk less: ");
				risk= input.nextInt();
			}
			if(risk==-1)//quits the game if the user chooses to
			{
				return(points);
			}
			if(!(risk==-1))//user makes a call if he or she does not quit the game
			{
				System.out.println("Make a call (0 for low, 1 for high): ");//user makes a high or low call
				userChoice=input.nextInt();
				total= die1.Roll() + die2.Roll();//adds the total of the two dice
				System.out.println("You rolled: " + total);//prints the total
			}
		return(total);
	}
		public int UserChoice()//returns high or low userChoice
		{
			return(userChoice);
		}
		public int Risk()//returns risked points
		{
			return(risk);
		}
	}
