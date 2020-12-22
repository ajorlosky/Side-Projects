/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/26/18
 *Card.java
 *Object Class
 *This code will randomly generate a number between 1 and 13 that corresponds to a card in the deck
 */
package blackjack;
public class Card {

    private int cardValue;//random value of a card from 1 to 13
    private String suitName;//random suitName: hearts, diamonds, clubs, spades
    public Card(int cv, String s)//constructor method where value and suit of the card generated are passed
    {
        cardValue=cv;
        suitName=s;
    }
    public String getSuitName()//returns the suitName to the Deck object
    {
        return(suitName);
    }
    public int getCardValue()//returns The cardValue to the Deck object
    {
        return(cardValue);
    }
    public void printCard()//prints the card depending on its value, with the corresponding generated suit
    {
        if(cardValue==1)//if the cardValue is 1, an ace with the generated suit is printed
        {
            System.out.println("Ace of " + suitName);
        }
        if(cardValue==11)//if the cardValue is 11, a jack with the generated suit is printed
        {
            System.out.println("Jack of " + suitName);
        }
        if(cardValue==12)//if the cardValue is 12, a queen with the generated suit is printed
        {
            System.out.println("Queen of " + suitName);
        }
        if(cardValue==13)//if the cardValue is 13, a king with generated suit is printed
        {
            System.out.println("King of " + suitName);
        }
        if(cardValue>=2 && cardValue<=10)// if the card value is between 2 and 10, the card with the corresponding generated value and suit is printed
        {
            System.out.println(cardValue + " of " + suitName);
        }
    }
}
