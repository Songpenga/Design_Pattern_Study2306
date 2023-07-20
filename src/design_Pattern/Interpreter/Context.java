package design_Pattern.Interpreter;

import java.util.StringTokenizer;

public class Context {
	private StringTokenizer tokenizer;
	private String currentKeyword;
	
	public Context(String script) {
		tokenizer = new StringTokenizer(script);
		readNextKeyword();
	}

	private String readNextKeyword() {
		if(tokenizer.hasMoreTokens()) {
			currentKeyword = tokenizer.nextToken();
		} else {
			currentKeyword = null;
		}
		
		return currentKeyword;
	}
	
	public String getCurrentKeyword() {
		return currentKeyword;
	}
	 

}
