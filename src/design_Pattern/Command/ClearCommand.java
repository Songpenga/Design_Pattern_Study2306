package design_Pattern.Command;

public class ClearCommand implements Command{

	@Override
	public void run() {
		System.out.println("\033[H\033");
		System.out.flush();
	}

}
