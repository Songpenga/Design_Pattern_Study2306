package design_Pattern.AbstractFactory;

public class MainEnrty {
	public static void main(String[] args) {
		ComponentFactory factory = new WindowsFactory();
		
		Button button = factory.createButton("확인");
		CheckBox checkBox = factory.createCheckBox(false);
		TextEdit textEdit = factory.createTextEdit("디자인패턴");
		
		button.render();
		checkBox.render();
		textEdit.render();
		
		button.clickEvent();
		checkBox.setChecked(true);
		textEdit.setValue("Gof의 디자인 패턴");
		
	}
}
