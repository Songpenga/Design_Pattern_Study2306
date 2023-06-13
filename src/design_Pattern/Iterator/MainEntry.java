package design_Pattern.Iterator;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		Item[] items = {
			new Item("CPU", 1000),
			new Item("Keyboard", 2000),
			new Item("Mouse", 3000),
			new Item("HDD", 500)
		};
		
		Array array = new Array(items);
		Iterator it = array.iterator();
		
		while(it.hasNext()) {
			Item item = (Item)it.next();
			System.out.println(item);
		}
	}
}
