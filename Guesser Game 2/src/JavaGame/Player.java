package JavaGame;

import java.util.Scanner;

public class Player {

	Scanner scn = new Scanner(System.in);
	int playerValue = scn.nextInt();
	
	public int getPlayerValue() {
		return playerValue;
	}
	
}
