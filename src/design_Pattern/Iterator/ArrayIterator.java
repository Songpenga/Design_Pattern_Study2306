package design_Pattern.Iterator;

import java.util.Iterator;

public class ArrayIterator implements Iterator { //Iterator 구현

	private Array array;
	private int index;
	
	public ArrayIterator(Array array) {
		this.array = array;
		this.index = -1;
	}
	
	@Override
	public boolean hasNext() {
		index++;
		return index < array.getCount();
	}

	@Override
	public Object next() {
		
		return array.getItem(index);
	}

}
