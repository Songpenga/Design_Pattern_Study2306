package design_Pattern.Interpreter;

public class BeginExpression implements Expression{
	private CommandListExpression expression;
	
	@Override
	public boolean parse(Context context) {
		if(checkValidKeyword(context.getCurrentKeyword())) {
			expression = new CommandListExpression();
			return expression.parse(context);
		}else {
			return false;
		}
	}

	@Override
	public boolean run() {
		return expression.run();
	}
	private static boolean checkValidKeyword(String Keyword) {
		return Keyword.equals("BEGIN");
	}

	@Override
	public String toString() {
		return "BEGIN" + expression;
	}
	
	


}
