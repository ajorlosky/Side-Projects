/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/8/18
 *DiceRollGame.java
 *Client Code
 *This program will ask the user to wager a point value, choose whether the dice roll will be high or low, and will allow the user to choose if he wants to continue the game after each chance.
 */
package diceRoll;

import java.util.Scanner;

public class DiceRollGame {

	public static void main(String [] args)
	{
		DRPlayer player1 = new DRPlayer();//creates player1 variable of DRPlayer object class
		Scanner input= new Scanner (System.in);
		
		int continueGame=1;
		int points=1000, risk, choice, total;
		System.out.print("Dice Roll Game: ");
		System.out.println();
		while(continueGame==1)//loops the dice roll game as long as the user wants to and has points to wager
		{
			if(points==0)//if the user has no more points the game will automatically end
			{
				System.out.println("You ran out of points, game over. ");
				continueGame=0;
			}
			if(points!=0)//if the user has points the game will continue
			{
				System.out.println("You have " + points + " points.");
				total = player1.RiskPoints(points);//asks the user how many points he or she would like to risk, their high or low call, and the dice will roll.
				risk = player1.Risk();//returns the value for the number of risked points and assigns it to the risk variable in client code
				choice = player1.UserChoice();//returns the high or low choice and assigns it to the variable choice in the client code
				if(total>=2 && total<=6)//if the dice total is low
				{
					if(choice==0)//if the user also calls that the dice total will be low, then the wagered points will be doubled and added to the total amount of points
					{
						points= points + (2*risk);
					}
					else if(choice==1)//if the user calls that the dice total will be high when it was low, then the wagered points will be lost
					{
						points= points - risk;
					}
				}
				if(total>=8 && total<=12)//if the dice total was high
				{
					if(choice==0)//if the user calls that the dice total will be low when it was high, then the wagered points will be lost
					{
						points= points - risk;
					}
					else if(choice==1)//if the user also calls that the dice total will be high, then the wagered points will be doubled and added to the total amount of points
					{
						points= points + (2*risk);
					}
				}
				if(total==7)// if the dice total was exactly 7, then the wagered points are lost
				{
					points= points - risk;
				}
				System.out.println("Would you like to continue the dice roll game? (1 for yes, 0 for no) : ");//user chooses if he or she wants to continue the game
				continueGame=input.nextInt();
				if(continueGame!=0 && continueGame!=1)//checks if the user enters a valid number
				{
					System.out.print("Error. Please enter a valid number:");
					continueGame=input.nextInt();
				}
			}
		}
		System.out.print("Thanks for playing.");
		input.close();
	}
	
}
