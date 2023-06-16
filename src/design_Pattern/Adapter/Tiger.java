package design_Pattern.Adapter;

public class Tiger {

	private String name;
	
	void SetName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void roar() {
		System.out.println("growl");
	}
}
