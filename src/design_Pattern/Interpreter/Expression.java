package design_Pattern.Interpreter;

public interface Expression {
	boolean parse(Context context);
	boolean run();
}
