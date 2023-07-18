package design_Pattern.AbstractFactory;

public class WindowsCheckBox extends CheckBox{

	public WindowsCheckBox(boolean bChecked) {
		super(bChecked);
	}

	@Override
	void render() {
		System.out.println(
				"windows 랜더링 api를 이용해"
				+ (this.bChecked ? "체크된" : " 체크안된")
				+"버튼을 그립니다.");			
	}

}
