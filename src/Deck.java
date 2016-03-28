/*
 * @author - Sara Wille
 * This Deck class randomly deals a number of cards.
 */

public class Deck {
	
	public Deck() {
		
	}
	
	public  static void dealCards(int howMany) {
		int counter = 0;
		while (counter < howMany) {
			Card newCard = new Card();
			newCard.getValue();
			System.out.print(" of ");
			newCard.getSuite();
			System.out.println();
			counter += 1;
		}
	}
}

