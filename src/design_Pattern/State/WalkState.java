package design_Pattern.State;

public class WalkState extends State{

	public WalkState(Player player) {
		super(player);
	}

	@Override
	public void standup() {
		player.setSpeed(0);
		player.talk("멈춰!!!");
		player.setState(new StandUpState(player));
	}

	@Override
	public void sitDown() {
		player.setSpeed(0);
		player.talk("갑자기 멈추면 넘어질수있어");
		player.setState(new SitDownState(player));
	}

	@Override
	public void walk() {
		player.talk("난 걷는걸 좋아하지..");
	}

	@Override
	public void run() {
		player.setSpeed(20);
		player.talk("걷다가 뛸꺼야!!!");
		player.setState(new RunState(player));;
	}

	@Override
	public String getDescription() {
		return "걷는중";
	}
	
	

}
