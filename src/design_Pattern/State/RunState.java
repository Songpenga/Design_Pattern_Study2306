package design_Pattern.State;

public class RunState extends State{

	public RunState(Player player) {
		super(player);
	}

	@Override
	public void standup() {		
		player.talk("뛰다가 갑자기 서면 무릎 인골이 나가요...");
		player.setSpeed(0);
		player.setState(new StandUpState(player));
	}

	@Override
	public void sitDown() {
		player.talk("뛰다가 갑자기 앉음");
		player.setSpeed(0);
		player.setState(new StandUpState(player));
	}

	@Override
	public void walk() {
		player.talk("속도를 줄입시다~");
		player.setSpeed(8);
		player.setState(new WalkState(player));
	}

	@Override
	public void run() {
		player.talk("더 빨리 뛸까?");
		player.setSpeed(player.getSpeed() + 2);
	}

	@Override
	public String getDescription() {
		return "뛰는중";
	}
	
}
