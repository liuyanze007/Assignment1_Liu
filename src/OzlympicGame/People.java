package OzlympicGame;

import java.util.Collections;
import java.util.List;

public abstract class People {
	protected String ID;
	protected String name;
	protected int age;
	protected String state;

	public People(String ID, String name, int age, String state){
		this.ID=ID;
		this.name=name;
		this.age=age;
		this.state=state;
	}
	
	public String getID(){
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String state(){
		return state;
	}
	
	public void setState(){
		this.state=state;
	}
	
}

abstract class athletes extends People {
	private int points;
	protected int time;
	
	public athletes(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		this.points=0;
		this.time=0;
		// TODO Auto-generated constructor stub
	}
	public void addPoints(int p){
		this.points+=p;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	abstract void compete(int type);
	
}

class swimmers extends athletes implements Swim{
	public swimmers(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}
	
	public void compete(int type) {
		
		 time=(int) (100+Math.random()*100);
		 swimming();
	}

	public void swimming(){
		System.out.println("Athlete"+ID+" "+name+" swimming  time="+time);
	}
	

}

class bicyclist extends athletes implements Cycle{
	public bicyclist(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}
	public void compete(int type) {
		
		 time=(int) (500+Math.random()*300);
		 cycling();
	}
	
   public void cycling(){
   	System.out.println("Athlete"+ID+" "+name+" cycling  time="+time);
   }
   
}

class runner extends athletes implements Run{
	public runner(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}
	public void compete(int type) {
		
		time=(int) (10+Math.random()*10);
		running();
	}
   public void running(){
   	  System.out.println("Athlete"+ID+" "+name+" running  time="+time);
   }

}

class superAthletes extends athletes{
	public superAthletes(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		// TODO Auto-generated constructor stub
	}
	
	public void compete(int type) {
		if(type==1){
			
			time=(int) (10+Math.random()*10);
			running();
		}
		else if(type==2){
			
			time=(int) (100+Math.random()*100);
			swimming();
		}
		else if(type==3){
			
			time=(int) (500+Math.random()*300);
			cycling();
		}
	}
	void swimming(){
		System.out.println("Athlete"+ID+" "+name+" swimming  time="+time);
	}
	
	void cycling(){
		System.out.println("Athlete"+ID+" "+name+" cycling  time="+time);
	}
	
	void running(){
		System.out.println("Athlete"+ID+" "+name+" running  time="+time);
	}
}

class officials extends People{

	public officials(String ID, String name, int age, String state) {
		super(ID, name, age, state);
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.state = state;
		// TODO Auto-generated constructor stub
	}
	
	public void summarise(){

	}
	
}