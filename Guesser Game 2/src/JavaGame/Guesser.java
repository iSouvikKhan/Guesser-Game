package JavaGame;

import java.util.Random;

public class Guesser {
	
	Random rn = new Random();
	int guessedNumber = rn.nextInt(100) + 1;
	
	public int getGuessedNumber() {
		System.out.println("\n\nCheating !! Cheating !! Number guessed by The Guesser is : "+guessedNumber+"\n\n");
		return guessedNumber;
	}
	
}
