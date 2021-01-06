//Imports
import java.util.Scanner;

public class Team {

    //Instance Var

    private String teamName;
    private int teamOffensiveRating;
    private int teamDefensiveRating;
    private static String[] winLoss;
    private static String[] listPlayers;

    //Constructor

    public Team(String teamNameInput){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Team Name: ");
        this.teamName = teamNameInput = input.nextLine();

    }

    //Methods

    public String getTeamName(){
        return this.teamName;
    }

    public void setTeamName(String newTeamName){
        this.teamName = newTeamName;
    }

}