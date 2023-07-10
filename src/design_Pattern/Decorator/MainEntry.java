package design_Pattern.Decorator;

public class MainEntry {
	public static void main(String[] args) {
		Strings strings = new Strings();
		
		strings.add("Hello~");
		strings.add("My name is Peng!");
		strings.add("I am a Developer");
		strings.add("Design-Pattern is powerful tool!");
		
		//strings.print();
		
		Item decorator = new SideDecorator(strings);
		decorator = new LineNumberDecorator(decorator);
		decorator = new BoxDecorator(decorator);
		
		decorator.print();
	}
}
