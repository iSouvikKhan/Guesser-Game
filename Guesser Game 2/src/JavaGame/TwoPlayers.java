package JavaGame;

public class TwoPlayers {
	
	int guessedByComputer;

	int[]playerValues = new int[2];
	
	String[]playerNames = new String[2];
	
	int[]playerPoints = new int[2];
	
	
	public void getGuessedByComputer() {
		guessedByComputer = new Guesser().getGuessedNumber();
	}
	
	
	public void getPlayerNames() {
		
		System.out.println("\nPlayer_1, please enter your name...");
		playerNames[0] = new NameInputs().getPlayerName();
		
		System.out.println("\nPlayer_2, please enter your name...");
		playerNames[1] = new NameInputs().getPlayerName();
		
	}
	
	
	public void getPlayerValue() {
		
		System.out.println(playerNames[0]+", guess any number from 1 to 100");
		playerValues[0] = new Player().getPlayerValue();
		
		System.out.println(playerNames[1]+", guess any number from 1 to 100");
		playerValues[1] = new Player().getPlayerValue();
		
	}
	
	
	public void CheckException() {
		new ExceptionImplementation().getCheckException(playerValues, playerNames);
	}
	
	
	public void GameLogic() {
		
		if(guessedByComputer == playerValues[0] && guessedByComputer == playerValues[1]) {
			playerPoints[0]++;
			playerPoints[1]++;
		}else if(guessedByComputer != playerValues[0] && guessedByComputer == playerValues[1]) {
			playerPoints[1]++;
		}else if(guessedByComputer == playerValues[0] && guessedByComputer != playerValues[1]) {
			playerPoints[0]++;
		}
		
	}
	
	
	public void getDecision(int set) {
		
		if(set == 4) {
			if(playerPoints[0] > playerPoints[1]) {
				System.out.println("\n\nCongratulations... "+playerNames[0]+", you won this game !!\n\n");
			}else if(playerPoints[1] > playerPoints[0]) {
				System.out.println("\n\nCongratulations... "+playerNames[1]+", you won this game !!\n\n");
			}else {
				System.out.println("\n\nGame Tied !!\n\n");
			}
		}
		
	}
	
	
	public void ThirdUmpire() {
		int set = 1;
		boolean flag= true;
		
		getPlayerNames();

		while(set != 4) {
			
			if(flag) {
				System.out.println("\n\nHi "+playerNames[0]+" and "+playerNames[1]+", I am The Umpire");
				System.out.println("Instruction : As you both have been participating in this game,\nI will give you 3 SETS to play.\nBased on the performance in each SET, I will declare the winner.");

				getGuessedByComputer();

				flag = false;
			}
			
			System.out.println("SET : "+set);
			
			getPlayerValue();
			
			CheckException();
						
			GameLogic();
			
			System.out.println("SET-"+set+" Results ="+"=> "+playerNames[0]+" : "+playerPoints[0]+" || "+playerNames[1]+" : "+playerPoints[1]);
			
			if(set != 3) {
				getGuessedByComputer();
			}
			
			set++;
		}
		
		getDecision(set);
		
	}
	
}
