package OzlympicGame;

public abstract class Game {
	protected int type;
	private String GID;
	private officials offical=null;

	
	public abstract void show();
	
	public Game(String GID){
		this.GID=GID;
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

	public officials getOffical() {
		return offical;
	}
	public void setOffical(officials offical) {
		this.offical = offical;
	}


}