import GameComponents.*;

import java.util.Scanner;
import gui_main.GUI;

public class Game {
    public static void main(String[] args) {

        //Die die_1 = new Die();
        //Die die_2 = new Die();
        GUI gui = new GUI();
        //gui.setDice(die_2.roll(),die_2.roll());
        Text gameInstruction = new Text("src/gametext.csv");
        PlayerTurn Turn = new PlayerTurn();
        Scanner userInput = new Scanner(System.in);

        //Prints welcome message
        gameInstruction.printText(1);


        System.out.print("Player 1: What's your name? ");
        String Player1=userInput.nextLine();

        System.out.print("Player 2: What's your name? ");
        String Player2=userInput.nextLine();

        Player player1 = new Player(Player1,1000);
        Player player2 = new Player(Player2,1000);

        int Win = 0;

        int turnToken = 0;

        while(Win ==0)
        {
            Turn.move(player1);

            if (player1.getPoints()>=3000)
            {
                System.out.println("Congratulations player 1: " +player1.getPlayerName()+ " you have won");
                Win = 1;
            }
            else if (player2.getPoints()>=3000)
            {
                System.out.println("Congratulations player 2: " +player2.getPlayerName()+ " you have won");
                Win = 1;
            }

            Turn.move(player2);
            if (player1.getPoints()>=3000)
            {
                System.out.println("Congratulations player 1: " +player1.getPlayerName()+ " you have won");
                Win = 1;
            }
            else if (player2.getPoints()>=3000)
            {
                System.out.println("Congratulations player 2: " +player2.getPlayerName()+ " you have won");
                Win = 1;
            }
        }



    }
}
