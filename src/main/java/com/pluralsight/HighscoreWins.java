package com.pluralsight;
import java.util.Scanner;

/**
 * Exercise 3 - Workbook 2a - Module 1.2
 * @author Behlul
 */
public class HighscoreWins {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userInput;
        String winnerTeam;


        System.out.println("Enter your game score in the following format --> Home:Visitor|21:9");
        userInput = myScanner.nextLine();
        if(userInput == null || userInput.isBlank()){ //check for input
            System.out.println("Error: Input cannot be empty");
            System.exit(1);
        }

        // Split first | then split again with : so its (names(home team:enemy team))|(scores(home team:enemy team))
        String[] teamNamesAndScores = userInput.split( "\\|");

        //check if there's no pipe |
        if (teamNamesAndScores.length != 2) {
            System.out.println("Error: Invalid format. Please use the format Name:Name|Score:Score");
            System.exit(1);
        }

        String[] teamNames = teamNamesAndScores[0].split(":");
        if(teamNames.length != 2) { //check if there's two teams
            System.out.println("Error: Invalid format. Please use the format Name:Name|Score:Score");
            System.exit(1);
        }

        String[] teamScores = teamNamesAndScores[1].split(":");

        if(Integer.parseInt(teamScores[0]) > Integer.parseInt(teamScores[1])){
            winnerTeam = teamNames[0];
        } else if(Integer.parseInt(teamScores[0]) < Integer.parseInt(teamScores[1])){
            winnerTeam = teamNames[1];
        } else{
            winnerTeam = "Tie";
        }
        System.out.println("Winner: " + winnerTeam);

    }
}
