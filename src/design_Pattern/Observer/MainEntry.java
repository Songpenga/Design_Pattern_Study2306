package design_Pattern.Observer;

public class MainEntry {
	public static void main(String[] args) {
		DiceGame diceGame = new FairDiceGame();
		
		Player player1 = new EvenBettingPlayer("노랑이");
		Player player2 = new OddBettingPlayer("얼룩이");
		Player player3 = new OddBettingPlayer("고등어");
		
		//Player 참가
		diceGame.addPlayer(player1);
		diceGame.addPlayer(player2);
		diceGame.addPlayer(player3);
		
		//주사위던짐
		for(int i=0; i<5; i++) {
			diceGame.play();
			System.out.println();
		}
		
	}
}
