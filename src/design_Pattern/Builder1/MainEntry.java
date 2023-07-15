package design_Pattern.Builder1;

import java.util.Random;

public class MainEntry {
	
	public static void main(String[] args) {
		Car car1 = new Car("v7", true, "Black", true, false);
		
		CarBuilder builder = new CarBuilder() //method chaining
				.setAEB(false)
//				.setAirbag(false)
				.setCameraSensor(true)
				.setColor("White")
				.setEngine("V9");
//				.build();
		
		Random random = new Random();
		Car car2 = builder
				.setAirbag(random.nextInt(2) == 0) //50% 확률로 에어백 장착 결정
				.build();
		
		System.out.println(car1);
		System.out.println(car2);
	}

}
