/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/26/18
 *Deck.java
 *Object Class
 *This code will randomly deal a deck of cards.
 */
package deckOfCards;
import java.util.ArrayList;
import java.util.Scanner;
public class Deck {

    private ArrayList<Card> DeckOfCards = new ArrayList<Card>();//creates an array list of cards for the deck
    private ArrayList<Card> anotherDeck = new ArrayList<Card>();//array list for another deck
    private int cardValue;//random value of a card from 1 to 13
    private String suitName;//random suitName: hearts, diamonds, clubs, spades
    Scanner input = new Scanner (System.in);
    public void DealCards()
    {
        Card tempCard;//creates a new tempCard variable for the Card object
        int totalCards=0;//nextCard is initialized to 0 and is added to after each loop for 52 cards
        int anotherCard=1;//allows the user to add another card to the deck
        boolean check;//check is used to evaluate if a card is already played in the deck
        while(totalCards<52 && anotherCard==1)//loop of printing cards continued if 52 card have not been dealt
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
                    //System.out.print(suitNumber +  "  " +DeckOfCards.get(i).getCardValue() + "  "  + suitName + "  " + DeckOfCards.get(i).getSuitName());
                    if(cardValue==DeckOfCards.get(i).getCardValue() && suitName.equals(DeckOfCards.get(i).getSuitName()))//if the card generated has the same value and suit as one in the deck, check is changed to true, continuing the do while loop to generate another card
                    {
                        check=true;
                    }
                }
            }while(check);//if check is true, another card is generated and compared to the deck, which makes sure the cards in the deck are all unique
            
            tempCard= new Card(cardValue, suitName);//creates the Card with the suit and value in the array list in the deck
            tempCard.printCard();//the card is printed with its value (1-13), name (jack, queen, king, ace, etc.), and its suit (hearts, diamonds, clubs, spades).
            DeckOfCards.add(tempCard);//adds the card to the DeckOfCards ArrayList
            totalCards+=1;//adds 1 to the number of cards in the deck
        }
    }
    public void AnotherDeck()//deals another deck of cards
    {
    	Card tempCard;//creates a new tempCard variable for the Card object
        int totalCards=0;//nextCard is initialized to 0 and is added to after each loop for 52 cards
        int anotherCard=1;//allows the user to add another card to the deck
        boolean check;//check is used to evaluate if a card is already played in the deck
        while(totalCards<52 && anotherCard==1)//loop of printing cards continued if 52 card have not been dealt
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
                for(int i=0; i<anotherDeck.size(); i++)//the for loop checks every card in the array list of cards in the deck to make sure that the previously generated card has not been dealt yet
                {
                    //System.out.print(suitNumber +  "  " +DeckOfCards.get(i).getCardValue() + "  "  + suitName + "  " + DeckOfCards.get(i).getSuitName());
                    if(cardValue==anotherDeck.get(i).getCardValue() && suitName.equals(anotherDeck.get(i).getSuitName()))//if the card generated has the same value and suit as one in the deck, check is changed to true, continuing the do while loop to generate another card
                    {
                        check=true;
                    }
                }
            }while(check);//if check is true, another card is generated and compared to the deck, which makes sure the cards in the deck are all unique
            
            tempCard= new Card(cardValue, suitName);//creates the Card with the suit and value in the array list in the deck
            tempCard.printCard();//the card is printed with its value (1-13), name (jack, queen, king, ace, etc.), and its suit (hearts, diamonds, clubs, spades).
            anotherDeck.add(tempCard);//adds the card to the DeckOfCards ArrayList
            System.out.print("Would you like to add another card to the deck? (1=yes  0=no) : ");
            anotherCard=input.nextInt();//user decides if he or she wants to add another card to the deck
            totalCards+=1;//adds 1 to the number of cards in the deck
        }
        int deckSize=anotherDeck.size()-1;
        for(int j=deckSize; j>0; j--)//removes all cards from the another deck arrayList
        {
        	anotherDeck.remove(j);
        }
    }
}

