/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *2/14/18
 *MySavings.java
 *Client Code
 *This program will prompt the user to display the total amount of money in the bank, choose to add money to a bank, or withdrawal money from the bank account.
 */
package piggyBank;
import java.util.Scanner;
public class MySavings {

	public static void main(String [] args)
	{
		int choice;
		Scanner input = new Scanner (System.in);
		PiggyBank PiggyBank1 = new PiggyBank();//makes new piggy bank
		do {  //allows the user to decide what he would like to do with his bank account
		System.out.print("\t1: Show total in bank.\n\t" 
					+ "2: Add a penny.\n\t"
					+ "3: Add a nickel.\n\t" 
					+ "4: Add a dime.\n\t"
					+ "5: Add a quarter.\n\t"
					+ "6: Take money out of the bank.\n\t"
					+ "Enter 0 to quit\t\n"
					+ "\tEnter your choice: ");
		choice= input.nextInt();
		switch (choice)//runs a certain task for the bank account depending on the choice made by the user
		{
		case 0: break;
		case 1: System.out.format("%9s %4.2f", "$", PiggyBank1.ShowTotal());
				System.out.println("\n"); break;//displays balance of bank account
		case 2: PiggyBank1.AddPenny();//adds $0.01 to the total account balance
				System.out.println(); break;
		case 3: PiggyBank1.AddNickel(); //adds $0.05 to the total account balance
				System.out.println(); break;
		case 4: PiggyBank1.AddDime(); //adds $0.10 to the total account balance
				System.out.println(); break;
		case 5: PiggyBank1.AddQuarter(); //adds $0.25 to the total account balance
				System.out.println(); break;
		case 6: PiggyBank1.RemoveMoney(); //lets the user decide how much many he or she wants to take out from the account
				System.out.println(); break;
		}
		}while(choice!=0);//continues the bank account transactions as long as the user chooses to
		input.close();
	}
}
