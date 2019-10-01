import java.util.Random;

// The Die class simulates a multi-sided die.

public class theDie {

	private int sides;	// Number of sides
	private int value;	// The die's value
	
	// The constructor performs an initial roll of the dice.\
	
	public theDie(int numSides) {
		sides = numSides;
		roll();
	}
	
	// The roll method simulates the rolling of the die
	
	public void roll() {
		int number = 1;
		// Create a random object.
		Random rand = new Random();
		
		// Get a random value for the die.
		value = rand.nextInt(sides) + number;
	}
	
	// The getSides method returns the number of sides for the dice.
	
	public int getSides() {
		return sides;
	}
	
	// The getValue method returns the value of the die
	
	public int getValue() {
		return value;
	}
	
}
