package elevens;

public class DeckTester {
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	/*public static void main(String[] args) {
		String [] rank = {"A", "B", "C"};
		String [] suit = {"Giraffes", "Lions"};
		int [] value = {2, 1, 6};
		Deck a = new Deck(rank, suit, value);
		
		System.out.println(a.isEmpty());
		System.out.println(a.getSize());
		System.out.println(a.deal());
		System.out.println(a.toString());

		String [] r2 = {"D", "E", "F"};
		String [] s2 = {"Hippos", "Elephants"};
		int [] v2 = {4, 7, 9};
		Deck b = new Deck(r2, s2, v2);
		
		String [] r3 = {"G", "H", "I"};
		String [] s3 = {"Cat", "Dog"};
		int [] v3 = {1, 3, 5};
		Deck c = new Deck(r3, s3, v3);
		
		//Deck Tester for earlier activities
	}*/
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		String [] r = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String [] s = {"hearts", "diamonds", "spades", "clubs"};
		int [] pV = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; 
		Deck e = new Deck(r, s, pV);
		System.out.println("Deck before shuffle: ");
		System.out.println(e.toString());
		e.shuffle();
		System.out.println("Deck after shuffle: ");
		System.out.println(e.toString());
	}
}
