package MadeByMe;

public class ExceptionImplementation {
	
	
	
	public void getCheckException(int[] playerValues, String[]playerNames) {
		for(int i=0;i<playerValues.length;i++) {
			try {
				if(playerValues[i] < 1 || playerValues[i] > 100) {
					throw new NumberOutOfBoundException("Number out of range !!");
				}
			}catch(NumberOutOfBoundException e) {
				System.out.println(e);
				System.out.println(e.getMessage());
				e.printStackTrace();
				return;
			}finally {
				if(playerValues[i] < 1 || playerValues[i] > 100) {
					System.out.println(playerNames[i]+", select any number from 1 to 100");
					System.exit(0);
				}
			}
		}
	}
	
	public void getCheckExceptionPlayerNumber(int totalPlayers) {
		try {
			if(totalPlayers < 1 || totalPlayers > 3) {
				throw new NumberOutOfBoundException("Number out of range !!");
			}
		}catch(NumberOutOfBoundException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}finally {
			if(totalPlayers < 1 || totalPlayers > 3) {
				System.out.println("More than 3 players are not allowed to play this game...");
				System.exit(0);
			}
		}
	}
	
}
