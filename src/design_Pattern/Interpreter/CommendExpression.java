package design_Pattern.Interpreter;

public abstract class CommendExpression implements Expression{

	protected String keyword;
	
	public CommendExpression(String keyword) {
		this.keyword = keyword;
	}
}
