package OzlympicGame;

public class People {
	private String ID;
	private String name;
	private int age;
	private String state;

	public People(String ID, String name, int age, String state){
		this.ID=ID;
		this.name=name;
		this.age=age;
		this.state=state;
	}
	
	public String getID(){
		return ID;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String state(){
		return state;
	}
	
	void compete(){
		
	}
}

class athletes extends People {
	
	public athletes(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}

	void compele(){
		
	}
	
}

class swimmers extends athletes{
	public swimmers(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}

	void swimming(){
		
	}
}

class bicyclist extends athletes{
	public bicyclist(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}

	void cycling(){
		
	}
}

class runner extends athletes{
	public runner(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}

	void running(){
		
	}
}

class superAthletes extends athletes{
	public superAthletes(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}
	void swimming(){
		
	}
	void cycling(){
		
	}
	void running(){
		
	}
}

class officials extends People{

	public officials(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}
	
	
}