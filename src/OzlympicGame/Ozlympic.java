package OzlympicGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

	private void displayAllAthlete() {        		//Display the points of all athletes
		// TODO Auto-generated method stub
		System.out.format("%-15s%-15s%-8s\n","Name","State","Ponits");
		System.out.println("");
		for(Athletes a:allAthletes){
			System.out.format("%-15s%-15s%-8s\n",a.getName(),a.getState(),a.getPoints());
		}
		
	}

	private void displayGameResult() {              //Display the final results of all games
		// TODO Auto-generated method stub
		for(int i=0;i<games.size();i++){
			  System.out.println("");
			  System.out.println((i+1)+". "+games.get(i).getGID());
			  System.out.format("  %-15s%-8s\n","Name","Time");
			  for(int j=0;j<games.get(i).getAthletes().size();j++){
				   Athletes a=games.get(i).getAthletes().get(j);
				   System.out.format("  %-15s%-8s\n",a.getName(),a.getTime());
					
				} 
		}
	}

	private void startGame() {
		// TODO Auto-generated method stub
		if(whichGame==-1){
			System.out.println("please select a	game to	run");
			return;
		}
		games.get(whichGame).show();
		//each athlete plays
		for(int i=0;i<games.get(whichGame).getAthletes().size();i++){
			games.get(whichGame).getAthletes().get(i).compete(games.get(whichGame).getType());
		}
		games.get(whichGame).getOffical().summarise(games.get(whichGame).getAthletes());
		user.check(games.get(whichGame));
	}

	private void PredictGame() {
		// TODO Auto-generated method stub
		if(whichGame==-1){
			System.out.println("please select a	game to	run");
			return;
		}
		for(int i=0;i<games.get(whichGame).getAthletes().size();i++){
			  System.out.println((i+1)+". "+games.get(whichGame).getAthletes().get(i).getName());
		}
		System.out.print("Enter an option(select a athlete):");
		while(true){
			int i=sc.nextInt();//select a athlete
			if(i>=1&&i<=games.get(whichGame).getAthletes().size()){
				i-=1;
				while(true){
					System.out.print("select a rank:");
					int rank=sc.nextInt();//select a rank
					if(rank>=1&&rank<=games.get(whichGame).getAthletes().size()){
						rank-=1;
						user.prediction(games.get(whichGame), games.get(whichGame).getAthletes().get(i).getID(), rank);
						break;
					}
					else{
						System.out.println("Invalid input");
					}
				}
				 
				  break;
			}
			else{
				System.out.println("Invalid input");
			}
		}
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

	private void readFile(String fileName) {
		// TODO Auto-generated method stub
		FileReader fileReader=null;
	    BufferedReader bufferedReader=null;
        File file = new File(fileName);
        try {
        	fileReader = new FileReader(file);
        	bufferedReader = new BufferedReader(fileReader);
            String s;
          
            while ((s=bufferedReader.readLine())!=null){
            	String[] line = s.split("\\s+");
                Game g=null;
                //judge the type of the game
                if(line[1].equals("1")){
                	g=new Running(line[0]);
                }
                else if(line[1].equals("2")){
                	g=new Swimming(line[0]);
                }
                else if(line[1].equals("3")){
                	g=new Cycling(line[0]);
                }
                int alCount=Integer.valueOf(line[2]);
                s=bufferedReader.readLine();
                line = s.split("\\s+");
                g.setOffical(new Officials(line[0],line[1],line[2],line[3]));
                for(int i=0;i<alCount;i++){
                	  s=bufferedReader.readLine();
                      line = s.split("\\s+");
                      Athletes a=null;
                    //judge the type of the athlete
                      if(line[4].equals("1")){
                    	  a=new runner(line[0],line[1],line[2],line[3]);
                      }
                      else if(line[4].equals("2")){
                    	  a=new swimmers(line[0],line[1],line[2],line[3]);
                      }
                      else if(line[4].equals("3")){
                    	  a=new bicyclist(line[0],line[1],line[2],line[3]);
                      }
                      else{
                    	  a=new superAthletes(line[0],line[1],line[2],line[3]);
                      }
                      allAthletes.add(a);
                      g.getAthletes().add(a);
                }
                games.add(g);
            }
          
            	
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
    			try {
    				if(bufferedReader!=null)
    					   bufferedReader.close();
    				if(fileReader!=null)
    					   fileReader.close();
    			} catch (Exception e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
            
        }
	}
}
