package design_Pattern.AbstractFactory;

public class LinuxFactory extends ComponentFactory{

	@Override
	public Button createButton(String cation) {
		return new LinuxButton(cation);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new LinuxCheckBox(bChecked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new LinuxTextEdit(value);
	}

}
