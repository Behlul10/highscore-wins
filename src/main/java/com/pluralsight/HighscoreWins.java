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

        // Split first | then split again with : so its (names(home team:enemy team))|(scores(home team:enemy team))
        String[] teamNamesAndScores = userInput.split( "\\|");

        String[] teamNames = teamNamesAndScores[0].split(":");
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
