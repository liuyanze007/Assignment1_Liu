package OzlympicGame;

import java.util.Collections;
import java.util.List;



public abstract class Athletes implements Comparable<Athletes> {
	protected String ID;
	protected String name;
	private int age;
	private String state;
	private int points;
	protected int time;

	
	public Athletes(String ID, String name, int age, String state) {
		this.ID=ID;
		this.name=name;
		this.age=age;
		this.state=state;
		this.points=0;
		this.time=0;
		// TODO Auto-generated constructor stub
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
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state=state;
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
	
	abstract void compete(int type); //set a method for every subclass 
	
}

class swimmers extends Athletes implements Swim{
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

	@Override
	public int compareTo(Athletes o) {
		// TODO Auto-generated method stub
		if(time>o.time){
			return 1;
		}
		else if(time<o.time){
			return -1;
		}
		return 0;
	}
	

}

class bicyclist extends Athletes implements Cycle{
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
@Override
public int compareTo(Athletes o) {
	// TODO Auto-generated method stub
	if(time>o.time){
		return 1;
	}
	else if(time<o.time){
		return -1;
	}
	return 0;
}
   
}

class runner extends Athletes implements Run{
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
@Override
public int compareTo(Athletes o) {
	// TODO Auto-generated method stub
	if(time>o.time){
		return 1;
	}
	else if(time<o.time){
		return -1;
	}
	return 0;
}

}

class superAthletes extends Athletes implements Swim,Run,Cycle{
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
	public void swimming(){
		System.out.println("Athlete"+ID+" "+name+" swimming  time="+time);
	}
	
	public void cycling(){
		System.out.println("Athlete"+ID+" "+name+" cycling  time="+time);
	}
	
	public void running(){
		System.out.println("Athlete"+ID+" "+name+" running  time="+time);
	}

	@Override
	public int compareTo(Athletes o) {
		// TODO Auto-generated method stub
		if(time>o.time){
			return 1;
		}
		else if(time<o.time){
			return -1;
		}
		return 0;
	}
}


	
