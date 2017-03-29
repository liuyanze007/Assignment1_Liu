package OzlympicGame;

import java.util.Collections;
import java.util.List;

public class Officials {
	private String id;
	private String name;
	private String age;
	private String state;
	
	public Officials(String id){
		this.id=id;
	}
	
	public Officials(String id, String name, String age, String state) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.state = state;
	}
    // game over,rank
	public void summarise(List<Athletes> Athletes){
		Collections.sort(Athletes);//rank
		Athletes.get(0).addPoints(5);
		Athletes.get(1).addPoints(2);
		Athletes.get(2).addPoints(1);
	}
}
