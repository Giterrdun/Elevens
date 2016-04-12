/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card cardA = new Card("King", "Clubs", 13);
		Card cardB =  new Card("Queen", "Hearts", 12);
		Card cardC = new Card ("Seven", "Spades", 7);
		cardA.matches(cardB);
		cardA.matches(cardC);
		cardB.matches(cardC);
	}
}
