package design_Pattern.Interpreter;

import java.util.ArrayList;
import java.util.Iterator;

public class CommandListExpression implements Expression{
	private ArrayList<CommendExpression> commands = new ArrayList<CommendExpression>();

	@Override
	public boolean parse(Context context) {
		while(true) {
			String currentKeyword = context.getCurrentKeyword();
			
			if(currentKeyword == null) {
				return false;				
			}else if(currentKeyword.equals("END")) {
				context.readNextKeyword();
				break;
			}else {
				CommendExpression command = null;				
				
				if(LoopCommandExpression.checkValidKeyword(currentKeyword)) {
					command = new LoopCommandExpression(currentKeyword);
				} else if(ActionCommandExpression.checkValidKeyword(currentKeyword)) {
					command = new ActionCommandExpression(currentKeyword);
				}
				
				if(command != null) {
					if(command.parse(context)) {
						commands.add(command);
					} else {
						return false;
					}
				}else {
					return false;
				}
			}
		}
	}

	@Override
	public boolean run() {
		Iterator<CommendExpression> iter = commands.iterator();
		
		while(iter.hasNext()) {
			boolean BOK = iter.next().run();
			if(!BOX) return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return commands.toString();
	}
	
	

}
