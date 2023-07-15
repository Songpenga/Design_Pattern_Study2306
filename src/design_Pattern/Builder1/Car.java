package design_Pattern.Builder1;

public class Car {
	private String engine; //엔진
	private boolean airbag; // 에어백 여부
	private String color; //차량 색상
	private boolean cameraSensor; //카메라 센서 유무
	private boolean AEB;
	
	public Car(String engine, boolean airbag, String color,
			boolean cameraSensor, boolean AEB) {
		this.engine = engine;
		this.airbag = airbag;
		this.color = color;
		this.cameraSensor = cameraSensor;
		this.AEB = AEB;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("A car SPEC \n");
		sb.append("Engine" + engine +  "\n");
		sb.append("airbag" + (airbag? "Y" : "N") + "\n");
		sb.append("color" + color + "\n");
		sb.append("cameraSensor" + (cameraSensor? "Y" : "N") + "\n");
		sb.append("AEB" + (AEB? "Y" : "N") + "\n");
		
		return sb.toString();
	}

	
}
