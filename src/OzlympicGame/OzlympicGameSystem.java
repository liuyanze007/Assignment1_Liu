package OzlympicGame;

import java.util.List;
import java.util.Scanner;

public class OzlympicGameSystem {
	private List<Game> games;//all games
	private List<Athletes> allAthletes;//all athletes
	private Scanner sc;
	private int whichGame;//the game selected
	private User user; //the user that predict the game

	
	
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
}
