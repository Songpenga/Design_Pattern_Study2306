package design_Pattern.Facade;

import java.util.HashMap;

public class DBMS {
//DB 저장
	private HashMap<String, Row> db = new HashMap<String, Row>();
	
	//생성자
	public DBMS() {
		db.put("peng", new Row("peng", "1990-02-11", "peng@naver.com"));
		db.put("ping", new Row("ping", "1991-03-12", "ping@naver.com"));
		db.put("pong", new Row("pong", "1992-04-13", "pong@naver.com"));
	}
	
	public Row query(String name) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();			
		}
		
		return db.get(name.toLowerCase());
	}
}
