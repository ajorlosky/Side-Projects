/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/26/18
 *DealDeck.java
 *Client Code
 *This code will randomly deal a deck of cards.
 */
package deckOfCards;

import java.util.Scanner;

public class DealDeck {
	
    public static void main (String[] args)
    {
    	System.out.println("Deck of Cards: \n"); 
    	Scanner input = new Scanner (System.in);
    	int anotherDeck;
    	Deck newDeck = new Deck();//a newDeck variable is created for the Deck object class
    	newDeck.DealCards();//the newDeck variable deals its deck using DealCards in the Deck object
    	System.out.println("The deck is out of cards. Would you like to reshuffle and deal another deck? (1=yes 0=no):");
    	anotherDeck = input.nextInt();
    	if(!(anotherDeck==0 || anotherDeck==1))//checks for invalid input
    	{
    		System.out.print("You did not enter a valid number. Please enter a valid number: ");
    		anotherDeck=input.nextInt();
    	}
    	if(anotherDeck==1)//reshuffles the deck if the user chooses to
    	{
    		System.out.println("\nAnother Deck of Cards: \n");
    		newDeck.AnotherDeck();
    	}
    	input.close();
    }
}
    