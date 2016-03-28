/*
 * @author - Sara Wille
 * This Card class randomly generates the suite and value of a playing card.
 */

public class Card {

	String suite = "";
	String value = "";
		
	public Card() {
		setSuite();
		setValue();
	}

	public void setSuite() {
		int suiteNum = (int) Math.ceil(Math.random() * 4);
		if (suiteNum == 1) {
			suite = "Hearts";
		} else if (suiteNum == 2) {
			suite = "Diamonds";
		} else if (suiteNum == 3) {
			suite = "Spades";
		} else {
			suite = "Clubs";
		}
	}
	
	public void getSuite() {
		System.out.print(suite);
	}
	
	public void setValue() {
		int valueNum = (int) Math.ceil(Math.random() * 14);
		if (valueNum == 1) {
			value = "1";
		} else if (valueNum == 2) {
			value = "2";
		} else if (valueNum == 3) {
			value = "3";
		} else if (valueNum == 4) {
			value = "4";
		} else if (valueNum == 5) {
			value = "5";
		} else if (valueNum == 6) {
			value = "6";
		} else if (valueNum == 7) {
			value = "7";
		} else if (valueNum == 8) {
			value = "8";
		} else if (valueNum == 9) {
			value = "9";
		} else if (valueNum == 10) {
			value = "10";
		} else if (valueNum == 11) {
			value = "J";
		} else if (valueNum == 12) {
			value = "Q";
		} else if (valueNum == 13) {
			value = "K";
		} else {
			value = "A";
		}
	}
	
	public void getValue() {
		System.out.print(value);
	}
	
}
