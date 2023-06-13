package design_Pattern.Iterator;

import java.util.Iterator;

public class Array implements Aggregator{ // Aggregator 구현
	private Item[] items;
	
	public Array(Item[] items) {
		this.items = items;		
	}
	
	public Item getItem(int index) {
		return items[index];
	}
	
	public int getCount() {
		return items.length;
	}
	
	@Override
	public Iterator iterator() {
		return new ArrayIterator(this);
	}
}
