/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *2/14/18
 *PiggyBank.java
 *Object Class
 *This program will prompt the user to display the total amount of money in the bank, choose to add money to a bank, or withdrawal money from the bank account.
 */
package piggyBank;
import java.util.Scanner;
public class PiggyBank {
	Scanner input = new Scanner (System.in);
	private double accountBalance=0.00;//sets the initial bank account balance to $0.00
	private double withdrawal;//used to let the user decide how much money he wants to take out
	
	public double ShowTotal()//displays balance of bank account
	{
		return(accountBalance);
	}
	public double AddPenny()//adds $0.01 to the total account balance
	{
		accountBalance += 0.01;
		return(accountBalance);
	}
	public double AddNickel()//adds $0.05 to the total account balance
	{
		accountBalance += 0.05;
		return(accountBalance);	
	}
	public double AddDime()//adds $0.10 to the total account balance
	{
		accountBalance += 0.10;
		return(accountBalance);
	}
	public double AddQuarter()//adds $0.25 to the total account balance
	{
		accountBalance += 0.25;
		return(accountBalance);
	}
	public double RemoveMoney()//lets the user decide how much many he or she wants to take out from the account
	{
		System.out.print("How much money would you like to remove? ");
		withdrawal=input.nextDouble();
		if(withdrawal>accountBalance)//makes sure the user withdrawals a amount in the bank account
		{
			System.out.print("You do not have enough money in your account. Please withdrawal a smaller amount.");
			withdrawal=input.nextDouble();
		}
		accountBalance-= withdrawal;//removes the amount of money desired from the bank account
		System.out.format("%9s %4.2f", "Remaining Balance $", accountBalance);//prints the remaining balance of the bank account
		System.out.println();
		return(accountBalance);
	}
}
