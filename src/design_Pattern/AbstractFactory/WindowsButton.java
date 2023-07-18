package design_Pattern.AbstractFactory;

public class WindowsButton extends Button{

	public WindowsButton(String caption) {
		super(caption);
	}

	@Override
	void render() {
		System.out.println(
				"windows 랜더링 api를 이용해"
				+ this.caption
				+"버튼을 그립니다.");		
	}
}
