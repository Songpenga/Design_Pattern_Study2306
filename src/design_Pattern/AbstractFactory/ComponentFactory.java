package design_Pattern.AbstractFactory;

public abstract class ComponentFactory {
	public abstract Button createButton(String cation);
	public abstract CheckBox createCheckBox(boolean bChecked);
	public abstract TextEdit createTextEdit(String value);
}
