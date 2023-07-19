package design_Pattern.State;

public abstract class State {
	protected Player player;
	
	public State(Player player) {
		this.player = player;
	}
	
	public abstract void standup();
	public abstract void sitDown();
	public abstract void walk();
	public abstract void run();
	public abstract String getDescription();
}
