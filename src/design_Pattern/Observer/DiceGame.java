package design_Pattern.Observer;
//주사위(상태변화) number을 player 에게 넘김

import java.util.LinkedList;

public abstract class DiceGame {
	protected LinkedList<Player> playerList = new LinkedList<Player>();
	
	public void addPlayer(Player player) {
		playerList.add(player);
	}
	
	public abstract void play();

}
