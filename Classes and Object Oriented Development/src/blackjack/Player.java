/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/26/18
 *DealDeck.java
 *Client Code
 *This code will contain the specific player actions in blackjack.
 */
package blackjack;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;
public class Player {
Scanner input = new Scanner(System.in);
private ArrayList<Card> DeckOfCards = new ArrayList<Card>();//creates an array list of cards for the deck
private int cardValue;//random value of a card from 1 to 13
private String suitName;//random suitName: hearts, diamonds, clubs, spades
private int l=0;//used when removing cards from the deck
	public int PlayerBetting(int c)//arranges the player's wager
	{
		int chips, wageredChips;
		chips=c;
		System.out.print("You have " + chips +  " chips. How many chips would you like to wager? :");//asks the user for how many chips he or she wants to wager
		wageredChips=input.nextInt();
		while(wageredChips>chips)//checks if the user wager is more than he or she has
		{
			System.out.print("You wagered more chips that you have. Please wager a small amount:");
			wageredChips=input.nextInt();
		}
		return(wageredChips);//returns the wager to the client code
	}
	public void CreateDeck()
    {
        Card tempCard;//creates a new tempCard variable for the Card object
        int totalCards=0;//nextCard is initialized to 0 and is added to after each loop for 52 cards
        boolean check;//check is used to evaluate if a card is already played in the deck
        while(totalCards<52)//loop of printing cards continued if 52 card have not been dealt
        {
            do
            {
                check=false;//check is initialized as false
                cardValue = (int) (13* Math.random() + 1);//a random card value between 1 and 13 is generated
                int suitNumber;
                suitNumber = (int) (4* Math.random() + 1);//a random suitNumber between 1 and 4 is generated for the 4 suits 
                if(suitNumber==1)//if the suitNumber generated is 1, the suit name is hearts
                {
                    suitName="hearts";
                }
                if(suitNumber==2)//if the suitNumber generated is 2, the suit name is spades
                {
                    suitName="spades";
                }
                if(suitNumber==3)//if the suitNumber generated is 3, the suit name is clubs
                {
                    suitName="clubs";
                }
                if(suitNumber==4)//if the suitNumber generated is 4, the suit name is diamonds
                {
                    suitName="diamonds";
                }
                for(int i=0; i<DeckOfCards.size(); i++)//the for loop checks every card in the array list of cards in the deck to make sure that the previously generated card has not been dealt yet
                {
                	//System.out.println(i);
                    //System.out.print(suitNumber +  "  " +DeckOfCards.get(i).getCardValue() + "  "  + suitName + "  " + DeckOfCards.get(i).getSuitName());
                    if(cardValue==DeckOfCards.get(i).getCardValue() && suitName.equals(DeckOfCards.get(i).getSuitName()))//if the card generated has the same value and suit as one in the deck, check is changed to true, continuing the do while loop to generate another card
                    {
                        check=true;
                    }
                }
            }while(check);//if check is true, another card is generated and compared to the deck, which makes sure the cards in the deck are all unique
            
            tempCard= new Card(cardValue, suitName);//creates the Card with the suit and value in the array list in the deck
            DeckOfCards.add(tempCard);//adds the card to the DeckOfCards ArrayList
            totalCards+=1;//adds 1 to the number of cards in the deck
        }
    }
	public int PrintCard(int h)
	{
		int hand=h;
		int aceValue=0;
		int totalValue=0;
		int dealerAce;
		cardValue= DeckOfCards.get(l).getCardValue();
		DeckOfCards.get(l).printCard();//prints the next card card from the deck arrayList
		l++;//adds one to the card number incrementor J
		 if(cardValue==1&&hand==1)//if an ace is drawn and it is the users turn
         {
         	System.out.print("You drew an Ace! Would you like its value as 1 or 11?: ");
         	aceValue=input.nextInt();//asks the user what value he or she wants the ace to have 1 or 11
         	while(!(aceValue==1||aceValue==11))//makes sure ace either is 1 or 11
         	{
         		System.out.print("You did not enter either 1 or 11. Please respond again:");
         		aceValue=input.nextInt();//asks the user to enter the value of the ace again
         	}
         	totalValue=aceValue;//assigns the ace value to the total card value
         }
         if(cardValue==1&&hand==0)//if an ace is drawn and it is the dealer's turn
         {
         	dealerAce= (int)(2 * Math.random() + 1);//generates 1 or 2 for its corresponding value of the ace
         	if(dealerAce==1)//if 1 is generated, the ace value will equal 1
         	{
         		aceValue=1;
         	}
         	if(dealerAce==2)//if 2 is generated, the ace value will equal 11
         	{
         		aceValue=11;
         	}
         	totalValue=aceValue;
         }
         if(cardValue>=2&&cardValue<=10)//if the card value is between 2 and 10, it will have the same total card value
         {
         	totalValue=cardValue;
         }
         if(cardValue>=11&&cardValue<=13)// if a face card is drawn 11 to 13, it will have the value of 10
         {
         	totalValue=10;
         }
         return(totalValue);
	}
	public void ReshuffleDeck()//removes all of the cards from the array list
	{
		int deckSize=DeckOfCards.size()-1;
        for(int j=deckSize; j>=0; j--)//removes all cards from the arrayList using j as the incrementor
        {
        	DeckOfCards.remove(j);//removes j card from the deck
        }
	}
}
