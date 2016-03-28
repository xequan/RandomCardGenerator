/*
 *@author - Sara Wille
 *This program uses the Deck class to generate a random deck of playing cards 
 */

public class CardGeneratorApp {
	
	public static void main(String[] args) {
		Deck myDeck = new Deck();
		System.out.println("My deck includes: ");
		myDeck.dealCards(7);
	}
}
