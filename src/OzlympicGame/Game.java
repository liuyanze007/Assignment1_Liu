package OzlympicGame;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
	protected int type;
	private String GID;
	private Officials offical=null;
	private List<Athletes> athletes;// participants
	
	public abstract void show();
	
	public Game(String GID){
		this.GID=GID;
		athletes=new ArrayList<Athletes>();
	}
	
	public String getGID() {
		return GID;
	}
	public void setGID(String GID) {
		GID = GID;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}

	public Officials getOffical() {
		return offical;
	}
	public void setOffical(Officials offical) {
		this.offical = offical;
	}
	
	public void setAthletes(List<Athletes> athletes) {
		this.athletes = athletes;
	}

	public List<Athletes> getAthletes() {
		// TODO Auto-generated method stub
		return athletes;
	}


}