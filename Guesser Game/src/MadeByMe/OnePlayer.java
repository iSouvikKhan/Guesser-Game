package MadeByMe;

public class OnePlayer {
	
	int guessedByComputer;

	int[]playerValues = new int[1];
	
	String[]playerNames = new String[1];
		
	
	public void getGuessedByComputer() {
		guessedByComputer = new Guesser().getGuessedNumber();
	}
	
	
	public void getPlayerName() {
		System.out.println("\nPlayer, please enter your name...");
		playerNames[0] = new NameInputs().getPlayerName();
	}
	
	
	public void getPlayerValue() {
		playerValues[0] = new Player().getPlayerValue();
	}
	
	
	public void CheckException() {
		new ExceptionImplementation().getCheckException(playerValues, playerNames);
	}
	
	
	public boolean GameLogic(int attempt) {
		if(guessedByComputer == playerValues[0]) {
			
			switch(attempt) {
				case 1:
					System.out.println("\n\nCongratulations... "+playerNames[0]+", you Won this game in "+attempt+"st attempt !!");
					break;
				case 2:
					System.out.println("\n\nCongratulations... "+playerNames[0]+", you Won this game in "+attempt+"nd attempt !!");
					break;
				case 3:
					System.out.println("\n\nCongratulations... "+playerNames[0]+", you Won this game in "+attempt+"rd attempt !!");
					break;
				default:
					break;
			}
			
			return true;
		}
		return false;
	}
	
	
	public void ThirdUmpire() {
		int count = 3;
		int attempt = 1;
		boolean flag= true;
		
		getPlayerName();
		
		getGuessedByComputer();
		
		while(count != 0) {
			
			if(flag) {
				System.out.println("Hi "+playerNames[0]+", I am The Umpire");
				System.out.println("Instruction : As you are the only player in this game,\nI will give you 3 attempts to win this game.\n");
				System.out.println(playerNames[0]+", guess any number from 1 to 100\n");
				flag = false;
			}
						
			if(count != 1) {
				System.out.println(playerNames[0]+", remember you have "+count+" attempts left");
			}else {
				System.out.println(playerNames[0]+", remember you have "+count+" attempt left");
			}
			
			getPlayerValue();
						
			CheckException();
			
			boolean bool = GameLogic(attempt);
			if(bool) {
				return;
			}
			
			count--;
			attempt++;
		}
		if(count == 0) {
			System.out.println("\n\nGame Over !! "+playerNames[0]+", you have consumed all your attempts...");
		}
	}
	
}
