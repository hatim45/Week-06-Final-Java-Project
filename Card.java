package week06;

public class Card {
	private int name;
	private int value;

	public Card(int name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	public Card(int num) {
		this.name = num / 13;
		this.value = num % 13;
			}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public String describe() {
			String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
			String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
			
			return values[value] + " of " + suits[name];
	}
}