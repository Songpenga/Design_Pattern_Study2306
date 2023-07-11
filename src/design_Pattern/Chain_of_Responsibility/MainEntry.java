package design_Pattern.Chain_of_Responsibility;

public class MainEntry {
	public static void main(String[] args) {
		Handler handler1 = new ProtocolHandler();
		Handler handler2 = new PortHandler();
		Handler handler3 = new DomainHandler();
		
		handler1.setNext(handler2).setNext(handler3); //chain
		
		String url = "https://www.youtube.com:1717117";
		System.out.println("INPUT" + url);
		
		handler1.run(url);
	}
}
