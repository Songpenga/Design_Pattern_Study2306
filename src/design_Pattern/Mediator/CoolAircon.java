package design_Pattern.Mediator;

public class CoolAircon extends Participant{

	public CoolAircon(Mediator mediator) {
		super(mediator);
	}

	
	private boolean bOff = true;

	public void on() {
		if(!bOff) return;
		
		bOff = false;
		
		mediator.participantChanged(this);
	}
	
	public void off() {
		if(bOff) return;
		
		bOff = true;
		
		mediator.participantChanged(this);
	}
	
	public boolean isRunning() {
		return !bOff;
	}
	
	public String toString() {
		if(bOff) return "# 에어컨: 꺼짐";
		else return  "# 에어컨: 켜짐";
	}
}
