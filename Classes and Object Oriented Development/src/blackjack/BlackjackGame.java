/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/26/18
 *BlackjackGame.java
 *Client Code
 *This code will allow a user to play a dealer in blackjack.
 */
package blackjack;
import java.util.Scanner;
public class BlackjackGame {

	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Blackjack:");
		int chips=500;//initializes total number of chips to 500
		int wager, userHandValue, dealerHandValue, userChoice, dealerBlackjack, userBlackjack;
		int reshuffle=1;//initializes reshuffle to 1, but is changed by the users request
		int gameStart=0;//initializes game start so that the deck is not reshuffled on the first
		int chipReset=1;//resets the chips when the user runs out and elects to reset
		double wagerBlackjack;//used to pay out 1.5 times chips in blackjack
		int anotherHand=1;//user decides to play another game 
		Player blackjack = new Player();//creates blackjack variable
		do//loops the entire game the user elects to play another hand
		{
			do//checks that the user inputs 1 or 0
			{
				if(gameStart==1) //makes sure it is not the first turn of the game
				{
					System.out.print("Would you like to reshuffle the deck? (1=yes 0=no): ");
					reshuffle=input.nextInt();//user decides to shuffle the deck each game
				}
			}while(!(reshuffle==0 || reshuffle==1));
			if(reshuffle==1 && gameStart==1)//if the user chooses to shuffle the hand and it is not the first game, the deck will be shuffled and a new deck will be created
			{
				blackjack.ReshuffleDeck();//shuffles deck in player object
				System.out.println("Deck Shuffled!");
				blackjack.CreateDeck();//creates deck of 52 cards in player object
			}
			if(gameStart==0)//on the first hand only a deck will be created, and it will ignore reshuffling
			{
				blackjack.CreateDeck();
			}
			if(chips==0)//if no chips are left the user is asked to reset their total amount of chips
			{
				System.out.print("You have no chips left. Would you like to reset your chip count to 500? (1=yes 0=no): ");
				chipReset=input.nextInt();
				if(chipReset==1)//resets the chip count to 500
				{
					chips=500;
				}
			}
			if(chips>0)//if there are enough chips a game of blackjack will be played
			{
				wagerBlackjack=0;
				userBlackjack=0;//these initialize the user and dealer blackjack to 0, so that they do not have blackjack when the game starts
				userChoice=1;//used to ask the user to hit or stay
				dealerHandValue=0;//counts the dealers hand value
				userHandValue=0;//counts the user hand value
				wager=blackjack.PlayerBetting(chips);//deals with the player betting
				System.out.print("Chips Wagered: " + wager + " chips\n\n");
				
				System.out.println("Users Cards: ");
				int hand=1;//indicates to the print card method that it is the users turn (allows for the ace to be 1 or 11)
				userHandValue+=blackjack.PrintCard(hand);//generates one card for the user and adds to the total user hand value
				userHandValue+=blackjack.PrintCard(hand);//generates one card for the user and adds to the total user hand value
				System.out.print("Total User Hand Value: " + userHandValue + "\n\n");
				
				System.out.print("Dealer Cards: \n");
				hand=0;//indicates to the print card method that it is the dealers turn (does not allow for the ace to be 1 or 11)
				dealerHandValue+=blackjack.PrintCard(hand);//generates one card for the user and adds to the total dealer hand value
				System.out.println("?");
				System.out.print("Total Dealer Hand Value: " + dealerHandValue + "\n\n");
				
				if(userHandValue==21)//checks if the users hand is blackjack with just 2 cards
				{
					System.out.println("The user has blackjack.");
					userBlackjack=1;
				}
				while(userHandValue<=21&&userChoice==1)//if the users does not have blackjack, the while loop will continue asking the user to hit or stay
				{
					System.out.println("Would you like to hit or stay? (1=hit 0=stay): ");
					userChoice=input.nextInt();//user decides to hit or stay
					while(!(userChoice==1||userChoice==0))//checks to make sure that the user either enters 1 or 0
					{
						System.out.print("You did not choose a valid option. Would you like to hit or stay? (1=hit 0=stay): ");
						userChoice=input.nextInt();
					}
					if(userChoice==1)//deals a card and adds its value to the total user hand value
					{
						hand=1;
						userHandValue+=blackjack.PrintCard(hand);//prints users card and adds to total
						System.out.print("Total User Hand Value: " + userHandValue + "\n\n");
					}
				}
				dealerBlackjack=1;//initializes dealerBlackjack to 1, so that it can be used to check of the dealer had blackjack
				hand=0;//indicates to the print card method that it is the dealers turn (does not allow for the ace to be 1 or 11)
				while(dealerHandValue<17)//if the dealer has a hand less than 17, he will automatically hit
				{
					dealerHandValue+=blackjack.PrintCard(hand);//deals a card for the dealer and adds to the total value
					System.out.print("Total Dealer Hand Value: " + dealerHandValue + "\n\n");
					if(dealerHandValue==21 && dealerBlackjack==1)//checks if the dealer has blackjack on the first two cards
					{
						System.out.println("The dealer has blackjack");
					}
					if(dealerHandValue!=21)//adds 1 to the dealer blackjack variable if the dealer does not have blackjack, preventing him from getting it anymore during the hand
					{
						dealerBlackjack+=1;//adds one to dealerBlackjack eliminating the possibility for dealer blackjack
					}
				}
				if(userHandValue==21 && userBlackjack==1 && dealerHandValue==21 && dealerBlackjack==1)//if both the dealer and the user get blackjack, they both push
				{
					System.out.println("User and dealer push. No chips are won.");
				}
				else if(userHandValue==21 && userBlackjack==0 && dealerHandValue==21 && dealerBlackjack!=1)//if neither the dealer and the user get blackjack, they both push
				{
					System.out.println("User and dealer push. No chips are won.");
				}
				else if(userHandValue==21 && userBlackjack==1 && dealerBlackjack!=1)//adds to the user chip count, if the user has blackjack and the dealer does not
				{
					System.out.println("User wins with blackjack!");
					wagerBlackjack= (double) wager; //changes the value of wager to a double so that it can be multiplied by 1.5 times on user blackjack
					wagerBlackjack=wagerBlackjack*1.5;//multiplies the wager by 1.5 times
					wager= (int) wagerBlackjack;//converts it back to an integer
					chips = chips + wager;//adds the 1.5x wager to the total chip count
				}
				else if(userBlackjack==0 && dealerHandValue==21 && dealerBlackjack==1)//if only the dealer gets blackjack, the user loses the wagered chips
				{
					System.out.println("Dealer wins with blackjack!");
					chips = chips - wager;
				}
				
				else if(userHandValue>21 && dealerHandValue>21)//if both bust, the loser loses chips
				{
					System.out.println("You busted!! Wagered chips are lost.");
					chips = chips - wager;
				}
				else if(userHandValue==dealerHandValue)//if both the user and dealer have equal hands, they push
				{
					System.out.print("User and dealer push. No chips are won.");
				}
				else if(userHandValue>21 && dealerHandValue<22)//if user busts and dealer does not, user loses the wager
				{
					System.out.println("You busted!! Wagered chips are lost.");
					chips = chips - wager;
				}
				else if(userHandValue>21 && dealerHandValue>21)//if user busts and dealer busts, user loses the wager
				{
					System.out.println("You busted!! Wagered chips are lost.");
					chips = chips - wager;
				}
				else if(dealerHandValue>21 && userHandValue<22)//if dealer busts and user does not, user loses the wager
				{
					System.out.println("Dealer busted!! User wins.");
					chips = chips + wager;
				}
				else if(userHandValue>dealerHandValue)//if users hand value is greater than the dealers, user wins the wager
				{
					System.out.println("User hand is greater than dealer hand. User wins.");
					chips = chips + wager;
				}
				else if(dealerHandValue>userHandValue)//if dealers hand value is less than the dealers, user loses wager
				{
					System.out.println("Dealer hand is greater than user hand. Dealer wins.");
					chips = chips + wager;
				}
			}
			do
			{
				System.out.print("Would you like to play another hand of Blackjack? (1=yes 0=no): ");//allows user to decide to play another hand of blackjack
				anotherHand=input.nextInt();
			}while((!(anotherHand==0 || anotherHand==1)));//makes sure the user inputs a 1 or 0
			if(chips<=0 && chipReset==0)//if the user runs out of chips and chooses to not continue the game, the blackjack game will end
			{
				System.out.print("You ran out of chips. Game over.");
				anotherHand=0;
			}
			gameStart=1;
		}while(anotherHand==1);
		input.close();
	}
}
