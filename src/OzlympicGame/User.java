package OzlympicGame;

public class User {
	private String predictathleteID;
	private int rank;
	private Game g;
	public User(){
		 this.g=null;
		 this.predictathleteID="";
		 this.rank=-1;
	}
	/**
	 * predict the rank of athlete
	 * @param g  the game predicted
	 * @param athleteID  the id of the athlete
	 * @param rank  the rank of the athlete
	 */
	public void prediction(Game g,String athleteID,int rank){
		 this.g=g;
		 this.predictathleteID=athleteID;
		 this.rank=rank;
	 }
	/**
	 * check whether the prediction is correct
	 * @param g the game finished
	 */
	public void check(Game g){
		if(this.g==g){
			if(g.getAthletes().get(rank).getId().equals(predictathleteID)){
				System.out.println("predict success");
			}
			else{
				System.out.println("predict failed");
			}
			
		}
		reset();
	}
	//reset prediction
    public void reset(){
    	 this.g=null;
		 this.predictathleteID="";
		 this.rank=-1;
    }
   
		
}
