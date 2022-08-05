package MadeByMe;

public class ThreePlayers {
	
	int guessedByComputer;
	
	int[]playerValues = new int[3];
	
	String[]playerNames = new String[3];
	
	int[]playerPoints = new int[3];
	
	
	public void getGuessedByComputer() {
		guessedByComputer = new Guesser().getGuessedNumber();
	}
	

	public void getPlayerNames() {
		
		System.out.println("\nPlayer_1, please enter your name...");
		playerNames[0] = new NameInputs().getPlayerName();
		
		System.out.println("\nPlayer_2, please enter your name...");
		playerNames[1] = new NameInputs().getPlayerName();
		
		System.out.println("\nPlayer_3, please enter your name...");
		playerNames[2] = new NameInputs().getPlayerName();
		
	}
	

	public void getPlayerValue() {
		
		System.out.println(playerNames[0]+", guess any number from 1 to 100");
		playerValues[0] = new Player().getPlayerValue();
		
		System.out.println(playerNames[1]+", guess any number from 1 to 100");
		playerValues[1] = new Player().getPlayerValue();
		
		System.out.println(playerNames[2]+", guess any number from 1 to 100");
		playerValues[2] = new Player().getPlayerValue();
		
	}
	
	
	public void CheckException() {
		new ExceptionImplementation().getCheckException(playerValues, playerNames);
	}
	
	
	public void GameLogic() {
				
		if(guessedByComputer == playerValues[0] && guessedByComputer == playerValues[1] && guessedByComputer == playerValues[2]) {
			playerPoints[0]++;
			playerPoints[1]++;
			playerPoints[2]++;
		}else if(guessedByComputer == playerValues[0] && guessedByComputer == playerValues[1] && guessedByComputer != playerValues[2]) {
			playerPoints[0]++;
			playerPoints[1]++;
		}else if(guessedByComputer != playerValues[0] && guessedByComputer == playerValues[1] && guessedByComputer == playerValues[2]) {
			playerPoints[1]++;
			playerPoints[2]++;
		}else if(guessedByComputer == playerValues[0] && guessedByComputer != playerValues[1] && guessedByComputer == playerValues[2]) {
			playerPoints[0]++;
			playerPoints[2]++;
		}else if(guessedByComputer == playerValues[0] && guessedByComputer != playerValues[1] && guessedByComputer != playerValues[2]) {
			playerPoints[0]++;
		}else if(guessedByComputer != playerValues[0] && guessedByComputer == playerValues[1] && guessedByComputer != playerValues[2]) {
			playerPoints[1]++;
		}else if(guessedByComputer != playerValues[0] && guessedByComputer != playerValues[1] && guessedByComputer == playerValues[2]) {
			playerPoints[2]++;
		}
		
	}
	
	
	public void getDecision(int set) {
		
		if(set == 4) {
			
			if(playerPoints[0] == playerPoints[1] && playerPoints[1] == playerPoints[2]) System.out.println("\n\nGame Tied among you all !!");
			else if(playerPoints[0] > playerPoints[1] && playerPoints[0] > playerPoints[2]) System.out.println("\n\nCongratulations... "+playerNames[0]+" Won !!");
			else if(playerPoints[1] > playerPoints[0] && playerPoints[1] > playerPoints[2]) System.out.println("\n\nCongratulations... "+playerNames[1]+" Won !!");
			else if(playerPoints[2] > playerPoints[0] && playerPoints[2] > playerPoints[1]) System.out.println("\n\nCongratulations... "+playerNames[2]+" Won !!");
			else if(playerPoints[0] == playerPoints[1] && playerPoints[0] != playerPoints[2]) System.out.println("\n\nGame Tied between "+playerNames[0]+" and "+playerNames[1]+" !!");
			else if(playerPoints[0] == playerPoints[2] && playerPoints[0] != playerPoints[1]) System.out.println("\n\nGame Tied between "+playerNames[0]+" and "+playerNames[2]+" !!");
			else if(playerPoints[1] == playerPoints[2] && playerPoints[1] != playerPoints[0]) System.out.println("\n\nGame Tied between "+playerNames[1]+" and "+playerNames[2]+" !!");
			

		}
		
	}
	
	
	public void ThirdUmpire() {
		int set = 1;
		boolean flag= true;
		
		getPlayerNames();
		
		getGuessedByComputer();
		
		while(set != 4) {
			
			if(flag) {
				System.out.println("Hi "+playerNames[0]+", "+playerNames[1]+" and "+playerNames[2]+", I am The Umpire");
				System.out.println("Instruction : As you three have been participating in this game,\nI will give you 3 SETS to play.\nBased on the performance in each SET, I will declare the winner.\n\n");
				flag = false;
			}
			
			System.out.println("SET : "+set);
			
			getPlayerValue();
			
			CheckException();
			
			GameLogic();
			
			System.out.println("SET-"+set+" Results ="+"=> "+playerNames[0]+" : "+playerPoints[0]+" || "+playerNames[1]+" : "+playerPoints[1]+" || "+playerNames[2]+" : "+playerPoints[2]);
			
			if(set != 3) {
				getGuessedByComputer();
			}
			
			set++;
		}
		
		getDecision(set);
		
	}

	
}