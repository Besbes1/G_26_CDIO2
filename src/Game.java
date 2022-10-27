import GameComponents.*;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Text gameInstruc = new Text("src/gametext.csv");
        Text squareDescrip = new Text("src/squaredescriptions");
        Scanner input = new Scanner(System.in);
        Player player1 = new Player(1,1000);
        Player player2 = new Player(2,1000);
        Cup diceCup = new Cup();
        Square board = new Square();

        int diceFaces;
        int currentSum;
        int pointsValue;

        //Prints welcome message
        gameInstruc.printText(1);

        //Asks player to choose dice
        gameInstruc.printText(7);

        diceFaces = input.nextInt();
        diceCup.setDiceFaces(diceFaces);

        //Tells player which dice chosen
        gameInstruc.printText(8);
        System.out.println(diceFaces);

        //while(player1)
        boolean extraTurn;
        do
        {
            extraTurn = true;
            //THROWS THE DICE AND PRINTS SQUARE DESCRIPTION ACCORDINGLY
            currentSum = diceCup.getSum();
            squareDescrip.printText(currentSum);

            //GETS THE VALUE OF THE SQUARE
            pointsValue = board.getPointValue(currentSum);
            player1.setPoints(pointsValue);
            player1.printBalance();

            if (currentSum != 10) {
                extraTurn = false;
            }

        } while (extraTurn = true);

    }
}
