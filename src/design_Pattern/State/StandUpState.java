package design_Pattern.State;

public class StandUpState extends State{

	public StandUpState(Player player) {
		super(player);
	}

	@Override
	public void standup() {
		player.talk("언제 움직일꺼야?");
	}

	@Override
	public void sitDown() {
		player.setState(new SitDownState(player));
		player.talk("앉으니까 편하고 좋다");
	}

	@Override
	public void walk() {
		player.setSpeed(5);
		player.setState(new WalkState(player));
		player.talk("걷기는 제 2의 생각하기다..");
	}

	@Override
	public void run() {
		player.setSpeed(10);
		player.setState(new RunState(player));
		player.talk("달리자!!!");
		
	}

	@Override
	public String getDescription() {
		return "제자리에 서있음";
	}

}
