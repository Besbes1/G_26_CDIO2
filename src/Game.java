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
        int diceFaces;

        //Prints welcome message
        gameInstruction.printText(1);


        gameInstruction.printText(2); //Prints Player 1 what's your name?
        String Player1=userInput.nextLine();

        gameInstruction.printText(3); //Prints Player 2 what's your name?
        String Player2=userInput.nextLine();

        Player player1 = new Player(Player1,1000);
        Player player2 = new Player(Player2,1000);

        //Asks player to choose dice
        gameInstruction.printText(12);

        diceFaces = userInput.nextInt();
        Turn.chooseDie(diceFaces);



        while(true)
        {

            if (player1.getPoints()>=3000)
            {
                //Prints out Congrats text
                System.out.println(gameInstruction.returnText(9) + " " + player1.getPlayerName() + "! " + gameInstruction.returnText(10));
                break;

            }
            else if (player2.getPoints()>=3000)
            {
                //Prints out Congrats text
                System.out.println(gameInstruction.returnText(9) + " " + player2.getPlayerName()+ "! " + gameInstruction.returnText(10));
                break;

            }
            Turn.move(player1);

            if (player1.getPoints()>=3000)
            {
                //Prints out Congrats text
                System.out.println(gameInstruction.returnText(9) + " " + player1.getPlayerName() + " " + gameInstruction.returnText(10));
                break;

            }
            else if (player2.getPoints()>=3000)
            {
                //Prints out Congrats text
                System.out.println(gameInstruction.returnText(9) + " " + player2.getPlayerName()+ " " + gameInstruction.returnText(10));
                break;

            }
            Turn.move(player2);
        }



    }
}
