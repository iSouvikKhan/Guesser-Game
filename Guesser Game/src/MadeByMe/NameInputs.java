package MadeByMe;

import java.util.Scanner;

public class NameInputs {

	Scanner scn = new Scanner(System.in);
	String playerName = scn.next();
	

	public String getPlayerName() {
		return playerName;
	}
	
}
