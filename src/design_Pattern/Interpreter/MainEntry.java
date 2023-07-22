package design_Pattern.Interpreter;

public class MainEntry {
	public static void main(String[] args) {
		String script = "BEGIN LOOG 2 BACK RIGHT END BACK END";
		
		Context context = new Context(script);
		
		while(true) {
			String keyword = context.getCurrentKeyword();
			if(keyword == null) break;
			
			System.out.println(keyword);
			
			context.readNextKeyword();
		}
	}
}
