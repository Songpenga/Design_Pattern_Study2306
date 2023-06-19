package design_Pattern.Singleton;

public class MainEntry {
	public static void main(String[] args) {
		//King king = new King();
		//The constructor King() is not visible
		
		King king = King.getInstance();
		king.say();
	}

}
