package OzlympicGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ozlympic {
	private List<Game> games;//all games
	private List<Athletes> allAthletes;//all athletes
	private Scanner sc;
	private int whichGame;//the game selected
	private User user; //the user that predict the game

	public Ozlympic(Scanner sc){
		games=new ArrayList<Game>();
		allAthletes=new ArrayList<Athletes>();
		this.sc=sc;
		whichGame=-1;
		user=new User();
		
	}
	
	//print the menu
	public void printMenu(){
		System.out.println("Ozlympic	Game");
		System.out.println("===================================");
		System.out.println("1.	Select a game to run");
		System.out.println("2.	Predict the winner of the game");
		System.out.println("3.	Start the game");	
		System.out.println("4.	Display the final results of all games");
		System.out.println("5.	Display the points of all athletes");
		System.out.println("6.	Exit");
		System.out.println("");
		System.out.print("Enter an option:");
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ozlympic op=new Ozlympic(sc);
		op.readFile("input.txt");
		int cmd=0;
		while(true){
			op.printMenu();
			cmd=sc.nextInt();
			if(cmd==1){
				op.selectGame();
			}
			else if(cmd==2){
				op.PredictGame();
			}
            else if(cmd==3){
				op.startGame();
			}
            else if(cmd==4){
				op.displayGameResult();
			}
            else if(cmd==5){
				op.displayAllAthlete();
			}
			else if(cmd==6){
				return;
			}
			else{
				System.out.println("Please enter a correct option.\n");
			}
		}
		
}

	private void displayAllAthlete() {
		// TODO Auto-generated method stub
		
		
		
	}

	private void displayGameResult() {
		// TODO Auto-generated method stub
		
	}

	private void startGame() {
		// TODO Auto-generated method stub
		
	}

	private void PredictGame() {
		// TODO Auto-generated method stub
		
	}

	private void selectGame() {
		// TODO Auto-generated method stub
		for(int i=0;i<games.size();i++){
			  System.out.println((i+1)+". "+games.get(i).getGID());
		}
		System.out.print("Enter an option:");
		
		while(true){
			whichGame=sc.nextInt();
			if(whichGame>=1&&whichGame<=games.size()){
				  whichGame-=1;
				  break;
			}
			else{
				System.out.println("Invalid input");
			}
		}
	}

	private void readFile(String string) {
		// TODO Auto-generated method stub
		
	}
}
