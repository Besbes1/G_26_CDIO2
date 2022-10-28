import GameComponents.*;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Text gameInstruction = new Text("src/gametext.csv");
        PlayerTurn Turn = new PlayerTurn();
        Scanner userInput = new Scanner(System.in);

        //Prints welcome message
        gameInstruction.printText(1);


        gameInstruction.printText(2); //Prints Player 1 what's your name?
        String Player1=userInput.nextLine();

        gameInstruction.printText(3); //Prints Player 2 what's your name?
        String Player2=userInput.nextLine();

        Player player1 = new Player(Player1,1000);
        Player player2 = new Player(Player2,1000);


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
