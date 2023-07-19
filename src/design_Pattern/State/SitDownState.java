package design_Pattern.State;

public class SitDownState extends State{

	public SitDownState(Player player) {
		super(player);
	}

	@Override
	public void standup() {		
		player.setState(new StandUpState(player));
		player.talk("일어나자~");
	}

	@Override
	public void sitDown() {		
		player.talk("앉자~");
		
	}

	@Override
	public void walk() {		
		player.talk("일단 일어나자");
		player.setState(new StandUpState(player));
		
	}

	@Override
	public void run() {
		player.talk("일단 뛰자");
		player.setState(new StandUpState(player));
		
	}

	@Override
	public String getDescription() {		
		return "앉아있음";
	}

}
