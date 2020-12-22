package elevens;
import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	private boolean find11;
	private boolean findJQK;
	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE MODIFIED IN ACTIVITY 11 *** */
		if (selectedCards.size() == 2) {
			return find11;
		} else if (selectedCards.size() == 3) {
			return findJQK;
		} else {
			return false;
		}
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE MODIFIED IN ACTIVITY 11 *** */
		List<Integer> cIndexes = cardIndexes();
		if(findPairSum11(cIndexes).size() > 0)
		{
			findPairSum11(cIndexes);
			findJQK(cIndexes);
			
			if(find11 || findJQK)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Look for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return a list of the indexes of an 11-pair, if an 11-pair was found;
	 *         an empty list, if an 11-pair was not found.
	 */
	private List<Integer> findPairSum11(List<Integer> selectedCards) {
		/* *** TO BE CHANGED INTO findPairSum11 IN ACTIVITY 11 *** */
		List<Integer> sum11 = new ArrayList<Integer>();
		for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) {
			int k1 = selectedCards.get(sk1).intValue();
			for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++) {
				int k2 = selectedCards.get(sk2).intValue();
				if (cardAt(k1).pointValue() + cardAt(k2).pointValue() == 11) {
					sum11.add(k1);
					sum11.add(k2);
					find11=true;
					return sum11;
				}
			}
		}
		find11=false;
		return sum11;
	}

	/**
	 * Look for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return a list of the indexes of a JQK, if a JQK was found;
	 *         an empty list, if a JQK was not found.
	 */
	private List<Integer> findJQK(List<Integer> selectedCards) {
		/* *** TO BE CHANGED INTO findJQK IN ACTIVITY 11 *** */
		List<Integer> checkJQK = new ArrayList<Integer>();
		List<Integer> empty = new ArrayList<Integer>();

		boolean foundJack = false;
		boolean foundQueen = false;
		boolean foundKing = false;
		for (Integer kObj : selectedCards) {
			int k = kObj.intValue();
			if (cardAt(k).rank().equals("jack")) {
				foundJack = true;
				checkJQK.add(k);
			} else if (cardAt(k).rank().equals("queen")) {
				foundQueen = true;
				checkJQK.add(k);
			} else if (cardAt(k).rank().equals("king")) {
				foundKing = true;
				checkJQK.add(k);
			}
		}
		if(foundJack && foundQueen && foundKing)
		{
			findJQK=true;
			return checkJQK;
		}
		else
		{
			findJQK=false;
			return empty;
		}
	}

	/**
	 * Looks for a legal play on the board.  If one is found, it plays it.
	 * @return true if a legal play was found (and made); false othewise.
	 */
	public boolean playIfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		if(playPairSum11IfPossible() || playJQKIfPossible())
		{
			return true;
		}
		return false; // REPLACE !
	}
	/**
	 * Looks for a pair of non-face cards whose values sum to 11.
	 * If found, replace them with the next two cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if an 11-pair play was found (and made); false othewise.
	 */
	private boolean playPairSum11IfPossible() {

		List<Integer> cIndexes = cardIndexes();
		List<Integer> sumCards;
		findPairSum11(cIndexes);
		
		if(find11)
		{
			sumCards = findPairSum11(cIndexes);
			replaceSelectedCards(sumCards);
			return(true);
		}
		else 
		{
			return false;
		}
		// REPLACE !
	}
	/**
	 * Looks for a group of three face cards JQK.
	 * If found, replace them with the next three cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if a JQK play was found (and made); false othewise.
	 */
	private boolean playJQKIfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		
		List<Integer> cIndexes = cardIndexes();
		List<Integer> JQKCards;
		findJQK(cIndexes);
		if(findJQK)
		{
			JQKCards = findJQK(cIndexes);
			replaceSelectedCards(JQKCards);
			return(true);
		}
		else 
		{
			return false;
		}
		// REPLACE !
	}
}
