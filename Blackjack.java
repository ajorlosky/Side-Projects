package blackjack;

import java.util.*;

public class Blackjack implements BlackjackEngine {

	private ArrayList<Card> deckOfCards = new ArrayList<Card>();;
	private ArrayList<Card> player = new ArrayList<Card>();
	private ArrayList<Card> dealer = new ArrayList<Card>();
	private final Random randomNum;
	private int num;
	private int chipTotal;
	private int playerBet;
	private int gameStatus;

	/**
	 * Constructor you must provide. Initializes the player's account to 200 and the
	 * initial bet to 5. Feel free to initialize any other fields. Keep in mind that
	 * the constructor does not define the deck(s) of cards.
	 * 
	 * @param randomGenerator
	 * @param numberOfDecks
	 */

	/*
	 * Constructor method for blackjack game: initializes the chipTotal, player's
	 * bet, number of decks, and sets the game Status to in progress at the start of
	 * the game.
	 */
	public Blackjack(Random randomGenerator, int numberOfDecks) {
		setAccountAmount(200);
		setBetAmount(5);
		num = numberOfDecks;
		randomNum = randomGenerator;
		gameStatus = GAME_IN_PROGRESS;
	}

	// Returns the total number of decks being used in the game.
	public int getNumberOfDecks() {
		return num;
	}

	/*
	 * clears the old deck(s) of cards and creates a new shuffled deck. It also sets
	 * alreadyWon to false, so that the in the next hand blackjack can be checked in
	 * both the player and dealer's new hands accurately.
	 */
	public void createAndShuffleGameDeck() {
		deckOfCards.clear();
		int j = 0;

		// adds all 52 cards of unique suit and value to the new deck and shuffles with
		// Collections
		while (j < num) {
			for (CardSuit suit : CardSuit.values()) {
				for (CardValue rank : CardValue.values()) {
					deckOfCards.add(new Card(rank, suit));
				}
			}
			j++;
		}
		Collections.shuffle(deckOfCards, randomNum);
	}

	// returns an array of the current gameDeck at any time during the game
	public Card[] getGameDeck() {
		Card[] newCards = new Card[deckOfCards.size()];
		newCards = deckOfCards.toArray(newCards);
		return newCards;
	}

	/*
	 * clears with player and dealer hands, creates a new shuffled deck, and gives
	 * two cards from the deck (face up) to the player and two cards (one face down)
	 * to the dealer. It subtracts the players bet from their chip total at the
	 * start of the game.
	 */

	public void deal() {
		player.clear();
		dealer.clear();
		createAndShuffleGameDeck();

		player.add(deckOfCards.get(0));
		deckOfCards.remove(0);

		dealer.add(deckOfCards.get(0));
		deckOfCards.remove(0);
		dealer.get(0).setFaceDown();

		player.add(deckOfCards.get(0));
		deckOfCards.remove(0);

		dealer.add(deckOfCards.get(0));
		deckOfCards.remove(0);

		gameStatus = GAME_IN_PROGRESS;
		chipTotal = chipTotal - playerBet;

	}

	// returns an array of the dealer's cards
	public Card[] getDealerCards() {
		Card[] dealerHand = new Card[dealer.size()];
		dealerHand = dealer.toArray(dealerHand);
		return dealerHand;
	}

	// checks the dealer's cards and returns the dealer's current total's under 21
	public int[] getDealerCardsTotal() {
		int numAces = 0;
		int total = 0;

		// checks the number of aces in the hand
		for (int i = 0; i < dealer.size(); i++) {
			if (dealer.get(i).getValue().getIntValue() == 1) {
				numAces += 1;
			}
		}
		ArrayList<Integer> possibilities = new ArrayList<Integer>();
		int k = 0;

		// with no aces in the hand, only one value is possible under 21, which is added
		// to possibilities
		if (numAces == 0) {
			for (int j = 0; j < dealer.size(); j++) {
				total += dealer.get(j).getValue().getIntValue();
			}
			possibilities.add(total);
			k++;
		}
		/*
		 * based on the number of aces in the hand, the possibilities is greater by 10
		 * than the initial combo ex. ace and face card = 11 and 21
		 */
		else {
			for (int j = 0; j < dealer.size(); j++) {
				total += dealer.get(j).getValue().getIntValue();
			}
			possibilities.add(total);
			while (k < numAces) {
				total += 10;
				possibilities.add(total);
				k++;
			}

		}

		/*
		 * list of possibilities is sorted and removed if greater than 21 and the
		 * resulting list is returned in an array.
		 */
		Collections.sort(possibilities);
		for (int j = possibilities.size() - 1; j >= 0; j--) {
			if (possibilities.get(j) > 21) {
				possibilities.remove(j);
			}
		}
		// returns null if the dealer has no combinations under 21
		if (possibilities.isEmpty()) {
			return null;
		}
		// returns combinations below 21
		else {
			int[] nums = new int[possibilities.size()];
			for (int l = 0; l < possibilities.size(); l++) {
				nums[l] = possibilities.get(l);
			}
			return nums;
		}
	}

	/*
	 * dealers current cards are evaluated for and the evaluation is returned,
	 * depending on the sum of the cards in the hand.
	 */
	public int getDealerCardsEvaluation() {
		int evaluation = LESS_THAN_21;
		int sumOfCards = 0;

		for (int i = 0; i < dealer.size(); i++) {
			sumOfCards += dealer.get(i).getValue().getIntValue();
		}
		// if sum of the cards is greater than 21: dealer busts
		if (sumOfCards > 21) {
			evaluation = BUST;
		}
		// if sum of the cards equals 21, the dealer has 21 (with 3 or more cards)
		else if (sumOfCards == 21) {
			evaluation = HAS_21;
		}
		// if sum of the cards equals 11...
		else if (sumOfCards == 11) {
			// occurs when a combo has an ace and two cards that add to 10 (this is 21 not
			// blackjack)
			if (getDealerCardsTotal()[getDealerCardsTotal().length - 1] == 21) {
				evaluation = HAS_21;
			}
			// evaluates dealer has for blackjack if two cards are an ace and some value of
			// 10
			if (dealer.size() == 2) {
				if (dealer.get(0).getValue().getIntValue() == 1) {
					if (dealer.get(1).getValue().getIntValue() == 10) {
						evaluation = BLACKJACK;
					}
				} else if (dealer.get(0).getValue().getIntValue() == 10) {
					if (dealer.get(1).getValue().getIntValue() == 1) {
						evaluation = BLACKJACK;
					}
				}
			}
		}
		return evaluation;
	}

	// returns the players cards in an array
	public Card[] getPlayerCards() {
		Card[] playerHand = new Card[player.size()];
		playerHand = player.toArray(playerHand);
		return playerHand;
	}

	// checks the player's cards and returns the dealer's current total's under 21
	public int[] getPlayerCardsTotal() {
		int numAces = 0;
		int total = 0;

		// checks the number of aces in the hand
		for (int i = 0; i < player.size(); i++) {
			if (player.get(i).getValue().getIntValue() == 1) {
				numAces += 1;
			}
		}
		ArrayList<Integer> possibilities = new ArrayList<Integer>();
		int k = 0;

		// with no aces in the hand, only one value is possible under 21, which is added
		// to possibilities
		if (numAces == 0) {
			for (int j = 0; j < player.size(); j++) {
				total += player.get(j).getValue().getIntValue();
			}
			possibilities.add(total);
			k++;
		}

		/*
		 * based on the number of aces in the hand, the possibilties is greater by 10
		 * than the intital combo ex. ace and face card = 11 and 21
		 */
		else {
			for (int j = 0; j < player.size(); j++) {
				total += player.get(j).getValue().getIntValue();
			}
			possibilities.add(total);
			while (k < numAces) {
				total += 10;
				possibilities.add(total);
				k++;
			}

		}
		/*
		 * list of possibilities is sorted and removed if greater than 21 and the
		 * resulting list is returned in an array.
		 */
		Collections.sort(possibilities);
		for (int j = possibilities.size() - 1; j >= 0; j--) {
			if (possibilities.get(j) > 21) {
				possibilities.remove(j);
			}
		}
		// returns null is player has no cards under 21
		if (possibilities.isEmpty()) {
			return null;
		}
		// returns array of totals under 21 for player
		else {
			int[] nums = new int[possibilities.size()];
			for (int l = 0; l < possibilities.size(); l++) {
				nums[l] = possibilities.get(l);
			}
			return nums;
		}
	}

	/*
	 * dealers current cards are evaluated for and the evaluation is returned,
	 * depending on the sum of the cards in the hand.
	 */
	public int getPlayerCardsEvaluation() {
		int evaluation = LESS_THAN_21;
		int sumOfCards = 0;

		for (int i = 0; i < player.size(); i++) {
			sumOfCards += player.get(i).getValue().getIntValue();
		}
		// occurs when a combo has an ace two cards that add to 10 (this is 21 not
		// blackjack
		if (sumOfCards > 21) {
			evaluation = BUST;
		}
		// if sum of the cards equals 21, the dealer has 21 (with 3 or more cards)
		else if (sumOfCards == 21) {
			evaluation = HAS_21;
		}
		// if sum of the cards equals 11...
		else if (sumOfCards == 11) {
			// occurs when a combo has an ace and two cards that add to 10 (this is 21 not
			// blackjack)
			if (getPlayerCardsTotal()[getPlayerCardsTotal().length - 1] == 21) {
				evaluation = HAS_21;
			}
			// evaluates dealer has for blackjack if two cards are an ace and some value of
			// 10
			if (player.size() == 2) {
				if (player.get(0).getValue().getIntValue() == 1) {
					if (player.get(1).getValue().getIntValue() == 10) {

						evaluation = BLACKJACK;
					}
				} else if (player.get(0).getValue().getIntValue() == 10) {
					if (player.get(1).getValue().getIntValue() == 1) {
						evaluation = BLACKJACK;
					}
				}
			}
		}
		return evaluation;
	}

	// the player hits and his cards are checked for bust
	public void playerHit() {
		player.add(deckOfCards.get(0));
		deckOfCards.remove(0);
		if (getPlayerCardsEvaluation() == BUST) {
			gameStatus = DEALER_WON;
		}
	}

	/*
	 * Once the player stands, the dealer's best possible total is checked to be
	 * less than 16 and not a bust. The dealer will continue to hit until they bust
	 * or their total is 16 or greater.
	 */
	public void playerStand() {
		dealer.get(0).setFaceUp();

		// finds the total of player cards under 21
		int playerTotals[] = getPlayerCardsTotal();

		// runs thru dealer's turn until a bust or hand between 16 and 21
		while (getDealerCardsEvaluation() != BUST && getDealerCardsTotal()[getDealerCardsTotal().length - 1] < 16) {

			dealer.add(deckOfCards.get(0));
			deckOfCards.remove(0);
		}
		// updates game status given dealer bust
		if (getDealerCardsEvaluation() == BUST) {
			gameStatus = PLAYER_WON;
			setAccountAmount(chipTotal + playerBet * 2);
		}
		// updates game status by comparing dealer best hand and player best hand
		else {
			if (getDealerCardsTotal()[getDealerCardsTotal().length - 1] == playerTotals[playerTotals.length - 1]) {
				gameStatus = DRAW;
				setAccountAmount(chipTotal + playerBet);
			} else if (getDealerCardsTotal()[getDealerCardsTotal().length - 1] > playerTotals[playerTotals.length
					- 1]) {
				gameStatus = DEALER_WON;
			} else {
				gameStatus = PLAYER_WON;
				setAccountAmount(chipTotal + playerBet * 2);
			}
		}
	}

	// returns current game status
	public int getGameStatus() {
		return gameStatus;
	}

	// allows bet amount to be set before game
	public void setBetAmount(int amount) {
		playerBet = amount;
	}

	// returns player bet amount
	public int getBetAmount() {
		return playerBet;
	}

	// sets the current chip total to what user decides
	public void setAccountAmount(int amount) {
		chipTotal = amount;
	}

	// returns the current chip total
	public int getAccountAmount() {
		return chipTotal;
	}

}