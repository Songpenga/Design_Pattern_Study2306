package design_Pattern.Interpreter;

public class ActionCommandExpression extends CommendExpression{

	public ActionCommandExpression(String keyword) {
		super(keyword);
	}

	@Override
	public boolean parse(Context context) {
		if(!checkValidKeyword(keyword))	return false;
		
		if(context.readNextKeyword() == null) return false;
		
		return true;
	}

	private static boolean checkValidKeyword(String Keyword) {
		boolean bKeywordOk = Keyword.equals("FRONT") ||
				Keyword.equals("BACK") || Keyword.equals("LEFT") ||
				Keyword.equals("RIGHT");
		
		return bKeywordOk;
	}
	
	@Override
	public boolean run() {
		System.out.println("cmd : " + keyword);
		return true;
	}
	
	public String toString() {
		return keyword;
	}
	

}
