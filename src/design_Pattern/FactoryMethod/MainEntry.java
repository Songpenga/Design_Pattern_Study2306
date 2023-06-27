package design_Pattern.FactoryMethod;

public class MainEntry {
	public static void main(String[] args) {
		Factory factory = new ItemFactory();
		
		Item item1 = factory.create("sword");
		if(item1 != null) item1.user();
		
		Item item2 = factory.create("sword");
		if(item2 != null) item2.user();
		
		Item item3 = factory.create("sword");
		if(item3 != null) item3.user();
		
		Item item4 = factory.create("sword");
		if(item4 != null) item4.user();
		
		factory.create("shield");
		factory.create("shield");
		factory.create("shield");
		factory.create("shield");
		
		factory.create("bow");
		factory.create("bow");
		factory.create("bow");
	}
}	
