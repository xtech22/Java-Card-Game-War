package Week6FinalProject;

public class Card {
	
	
	String name;
	String value;
	int rank;


	Card(String name, String value, int rank) {
		this.name = name;
		this.value = value;
		this.rank = rank;
	}
	/*Methods
	Getters and Setters
	describe (prints out information about a card)
	*/

	//Returns the cards rank
	public int getRank() {
		return rank;
	}

	//Sets the cards rank
	public void setRank(int rank) {
		this.rank = rank;
	}

	//Returns the card name
	public String getName() {
		return name;
	}

	//Sets the card name
	public void setName(String name) {
		this.name = name;
	}

	//Returns the cards value
	public String getValue() {
		return value;
	}

	//Sets the cards value
	public void setValue(String value) {
		this.value = value;
	}

	//This prints out the card information
	public void describe() {
		System.out.println(this.name + " of " + this.value);
	}
}
