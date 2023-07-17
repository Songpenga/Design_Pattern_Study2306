package design_Pattern.Command;

public class MainEntry {
	public static void main(String[] args) {
		
		CommandGroup cmdGroup = new CommandGroup();
		
		Command clearCmd = new ClearCommand();
		cmdGroup.add(clearCmd);
		
		//clearCmd.run(); 1.
		
		Command yellowCommandcmd = new ColorCommand(ColorCommand.Color.YELLOW);
		cmdGroup.add(yellowCommandcmd);
		//yellowCommandcmd.run();
		
		Command moveCmd = new MoveCommand(10, 1);
		cmdGroup.add(moveCmd);
		//moveCmd.run();
		
		Command printCmd = new PrintCommand("안녕하세요!! This is Design Pattern!!");
		cmdGroup.add(printCmd);
		//printCmd.run();
		
		Command moveCmd2 = new MoveCommand(15, 5);
		cmdGroup.add(moveCmd2);
//		moveCmd2.run();
//		printCmd.run();
		
		Command moveCmd3 = new MoveCommand(25, 8);
		cmdGroup.add(moveCmd3);
//		moveCmd3.run();
		
		Command GreenColorCmd = new ColorCommand(ColorCommand.Color.GREEN);
		cmdGroup.add(GreenColorCmd);
		cmdGroup.add(printCmd);
		
//		GreenColorCmd.run();		
//		printCmd.run();
		
		cmdGroup.run();
	}
}
