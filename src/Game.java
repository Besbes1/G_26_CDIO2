import GameComponents.*;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Text gameInstruction = new Text("src/gametext.csv");

        Scanner userInput = new Scanner(System.in);

        //Prints welcome message
        gameInstruction.printText(1);


        System.out.print("Player 1: What's your name? ");
        String Player1=userInput.nextLine();

        System.out.print("Player 2: What's your name? ");
        String Player2=userInput.nextLine();

        Player player1 = new Player(Player1,1000);
        Player player2 = new Player(Player2,1000);


        int turn = 0;




















    }
}
