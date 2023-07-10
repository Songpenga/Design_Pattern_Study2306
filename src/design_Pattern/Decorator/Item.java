package design_Pattern.Decorator;

public abstract class Item {
	public abstract int getLinesCount();
	public abstract int getMaxLength(); //가장 긴 문자열 길이
	public abstract int getLength(int index);
	public abstract String getString(int index);
	
	public void print() {
		int cntLines = getLinesCount();
		for(int i=0; i<cntLines; i++) {
			String string = getString(i);
			System.out.println(string);
		}
	}
}
