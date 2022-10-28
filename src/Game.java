import GameComponents.*;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Text gameInstruction = new Text("src/gametext.csv");
        PlayerTurn Turn = new PlayerTurn();
        Scanner userInput = new Scanner(System.in);

        //Prints welcome message
        gameInstruction.printText(1);


        gameInstruction.printText(2);
        String Player1=userInput.nextLine();

        gameInstruction.printText(3);
        String Player2=userInput.nextLine();

        Player player1 = new Player(Player1,1000);
        Player player2 = new Player(Player2,1000);


        while(true)
        {

            if (player1.getPoints()>=3000)
            {
                //Prints out Congrats text
                System.out.println(gameInstruction.returnText(9) +player1.getPlayerName()+ gameInstruction.returnText(10));
                break;

            }
            else if (player2.getPoints()>=3000)
            {
                System.out.println("Congratulations player 2: " +player2.getPlayerName()+ " you have won");
                break;

            }
            Turn.move(player1);

            if (player1.getPoints()>=3000)
            {
                System.out.println("Congratulations player 1: " +player1.getPlayerName()+ " you have won");
                break;

            }
            else if (player2.getPoints()>=3000)
            {
                System.out.println("Congratulations player 2: " +player2.getPlayerName()+ " you have won");
                break;

            }
            Turn.move(player2);
        }



    }
}
