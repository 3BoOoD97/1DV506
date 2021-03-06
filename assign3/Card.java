package assign3;


public class Card {
	public enum Suites {HEARTS, DIAMONDS, SPADES, CLUBS};

	public enum Ranks {
		TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
		EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(1);

		private int value;
		private Ranks (int aVal){value = aVal;}
		public int getDescription(){return value;}
	}

	private Suites suite;
	private Ranks rank;

	/*CONSTRUCTORS*/
	public Card (Suites suite, Ranks rank){
		this.suite = suite;
		this.rank = rank;
	}
	public Card (Card input){
		this.suite = input.suite;
		this.rank = input.rank;
	}

	/*METHODS*/
	public int getValue(){return this.rank.getDescription();}

	public String toString(){
		String str = "RANK: " + Integer.toString(this.getValue()) 
					+ " - SUITE: " + suite.toString() + "\n";
		return str;
	}

}
