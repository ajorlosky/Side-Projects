package elevens;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		Card a = new Card("Ace", "Hearts", 1);
		Card b = new Card("Jack", "Diamonds", 11);
		Card c = new Card("Queen", "Spades", 12);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());

	}
}
