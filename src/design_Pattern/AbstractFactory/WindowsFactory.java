package design_Pattern.AbstractFactory;

public class WindowsFactory extends ComponentFactory{

	@Override
	public Button createButton(String cation) {
		return new WindowsButton(cation);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new WindowsCheckBox(bChecked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new WindowsTextEdit(value);
	}
	

}
