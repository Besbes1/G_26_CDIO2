import GameComponents.*;

import java.util.Scanner;
import gui_main.*;
import gui_fields.*;


public class Game {
    public static void main(String[] args) {

        Text gameInstruction = new Text("src/gametext.csv");
        Text squareDescription = new Text("src/squaredescriptions");

        GUI gui = new GUI();
        PlayerTurn Turn = new PlayerTurn();
        Scanner userInput = new Scanner(System.in);

        int diceFaces;
        int[] DiceArray = new int[3];

        //Prints welcome message
        gameInstruction.printText(1);

        gameInstruction.printText(2); //Prints Player 1 what's your name?
        String Player1=userInput.nextLine();

        gameInstruction.printText(3); //Prints Player 2 what's your name?
        String Player2=userInput.nextLine();

        Player player1 = new Player(Player1,1000);
        Player player2 = new Player(Player2,1000);

        GUI_Player Player1gui = new GUI_Player(Player1, player1.getPoints());
        gui.addPlayer(Player1gui);

        GUI_Player Player2gui = new GUI_Player(Player2, player2.getPoints());
        gui.addPlayer(Player2gui);

        GUI_Field field = gui.getFields()[0];
        field.setCar(Player1gui, true);
        field.setCar(Player2gui, true);

        gui.getFields()[1].setTitle("Tower");
        gui.getFields()[2].setTitle("Crater");
        gui.getFields()[3].setTitle("Palace gates");
        gui.getFields()[4].setTitle("Cold Desert");
        gui.getFields()[5].setTitle("Walled City");
        gui.getFields()[6].setTitle("Monastery");
        gui.getFields()[7].setTitle("Black Cave");
        gui.getFields()[8].setTitle("Huts in the Mountain");
        gui.getFields()[9].setTitle("The Were-wall (werewolf-wall)");
        gui.getFields()[10].setTitle("The pit");
        gui.getFields()[11].setTitle("Goldmine");





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
            gui.getFields()[DiceArray[2]].setCar(Player2gui,false);

            DiceArray = Turn.move(player1);

            gui.setDice(DiceArray[1],DiceArray[2]);
            gui.getFields()[DiceArray[2]].setCar(Player1gui,true);
            gui.showMessage(squareDescription.returnText(DiceArray[2]));
            Player1gui.setBalance(player1.getPoints());

            if (player1.getPoints()>=3000)
            {
                //Prints out Congrats text
                System.out.println(gameInstruction.returnText(9) + " " + player1.getPlayerName() + " " + gameInstruction.returnText(10));
                String guiMessage = gameInstruction.returnText(9) + " " + player1.getPlayerName() + " " + gameInstruction.returnText(10);
                gui.showMessage(guiMessage);
                break;

            }
            else if (player2.getPoints()>=3000)
            {
                //Prints out Congrats text
                System.out.println(gameInstruction.returnText(9) + " " + player2.getPlayerName()+ " " + gameInstruction.returnText(10));
                String guiMessage = gameInstruction.returnText(9) + " " + player2.getPlayerName()+ " " + gameInstruction.returnText(10);
                gui.showMessage(guiMessage);
                break;

            }
            gui.getFields()[DiceArray[2]].setCar(Player1gui,false);

            DiceArray = Turn.move(player2);

            gui.setDice(DiceArray[1],DiceArray[2]);
            gui.getFields()[DiceArray[2]].setCar(Player2gui,true);
            gui.showMessage(squareDescription.returnText(DiceArray[2]));
            Player2gui.setBalance(player2.getPoints());

        }



    }
}
