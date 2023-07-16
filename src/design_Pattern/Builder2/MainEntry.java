package design_Pattern.Builder2;

public class MainEntry {

	public static void main(String[] args) {
		Data data = new Data("Jane", 25);
		Builder builder = new PlainTextBuilder(data); //오타 수정
		Director director = new Director(builder);
		String result = director.build();
		System.out.println(result);
		
		builder = new JSONBuilder(data);
		director = new Director(builder);
		result = director.build();
		System.out.println(result);
		
		builder = new XMLBuilder(data);
		director = new Director(builder);
		result = director.build();
		System.out.println(result);
		
	}

}
