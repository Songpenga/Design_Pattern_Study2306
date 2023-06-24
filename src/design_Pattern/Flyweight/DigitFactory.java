package design_Pattern.Flyweight;
//원하는 객체를 전달하는 기능
public class DigitFactory {
	private Digit[] pool = new Digit[] {
		null, null, null, null, null,
		null, null, null, null, null
	};
	
	public Digit getDigit(int n) {
		if(pool[n] != null) {
			return pool[n];
		}else {
			String fileName = String.format("/design_Pattern/Flyweight/%d.txt", n);
			Digit digit = new Digit(fileName);
			pool[n] = digit;
			return digit;
		}
	}
}
