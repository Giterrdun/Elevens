/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = {"hearts","spades","diamonds","clubs"};
		String[] ranks = {"Ace","one","two","three","four","five","six","seven","eight","nine","ten","Jack","Queen","King"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck full = new Deck(ranks,suits,values);
		
//		String[] suits2 = {"hearts","spades","diamonds","clubs"};
//		String[] ranks2 = {"Ace","one","two","three","four","five","six","seven"};
//		int[] values2 = {1,2,3,4,5,6,7,8};
//		
//		Deck half = new Deck(ranks2,suits2,values2);
//		
//		String[] suits3 = {"hearts","spades","diamonds","clubs"};
//		String[] ranks3 = {"Ace","ten","Jack","Queen","King"};
//		int[] values3 = {1,10,11,12,13};
//		
//		Deck small = new Deck(ranks3,suits3,values3);
		
		full.deal();
//		half.size();
//		small.isEmpty();
	}
}
