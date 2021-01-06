import java.util.Scanner;

public class Players {

    //Instance Var

    private String playerName;
    private String position;
    private int playerOffensiveRating;
    private int playerDefensiveRating;

    //Constructor

    public Players(String playerNameInput, int playerDefensiveRatingInput, int playerOffensiveRatingInput){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        this.playerName = playerNameInput = input.nextLine();
        System.out.println("Enter Defensive Rating: ");
        this.playerDefensiveRating = playerDefensiveRatingInput = input.nextInt();
        System.out.println("Enter Offensive Rating: ");
        this.playerOffensiveRating = playerOffensiveRatingInput = input.nextInt();

    }

    //Methods

    public void setDefensiveRating(int newPlayerDefensiveRating){
        this.playerDefensiveRating = newPlayerDefensiveRating;
    }

    public void setOffensiveRating(int newPlayerOffensiveRating){
        this.playerOffensiveRating = newPlayerOffensiveRating;
    }

    public void setPlayerName(String newPlayerName){
        this.playerName = newPlayerName;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public int getOffensiveRating(){
        return this.playerOffensiveRating;
    }

    public int getDefensiveRating(){
        return this.playerOffensiveRating;
    }

}