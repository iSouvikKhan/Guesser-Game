package MadeByMe;

public class Umpire {
	
	int totalPlayers;
	
	int guessedByComputer;
	
	
	public void getTotalNumberOfPlayers() {
		System.out.println("Remember at max 3 players can play at a time.\nSelect the number of players");
		totalPlayers = new NumberOfPlayers().getTotalNumberOfPlayers();		
	}
	
	
	public void CheckException() {
		new ExceptionImplementation().getCheckExceptionPlayerNumber(totalPlayers);
	}
	
	
	public void getUmpireDecision() {
				
		getTotalNumberOfPlayers();
		
		CheckException();
		
		//----------- Game ---------------
		
		switch (totalPlayers) {
			case 1:

				OnePlayer one = new OnePlayer();
				one.ThirdUmpire();
				
			    break;
			case 2:

				TwoPlayers two = new TwoPlayers();
				two.ThirdUmpire();
				
			    break;
			case 3:

				ThreePlayers three = new ThreePlayers();
				three.ThirdUmpire();
				
			    break;
			default :
				return;
		}
		
		return;
	}
	
}
