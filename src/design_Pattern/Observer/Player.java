package design_Pattern.Observer;

public abstract class Player {
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//주사위 상태변화
	public abstract void update(int diceNumber);
}
