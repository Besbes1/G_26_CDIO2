import GameComponents.*;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Text gameInstruc = new Text("src/gametext.csv");
        Text squareDescrip = new Text("src/squaredescriptions");
        Scanner input = new Scanner(System.in);
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Cup diceCup = new Cup();
        Square board = new Square();

        int diceFaces;
        int currentSum;
        int pointsValue;
        int player1Balance = player1.getBalance();
        System.out.println("Player 1 start balance: " + player1.getBalance());
        int player2Balance = player2.getBalance();
        System.out.println("Player 2 start balance: " + player2.getBalance());


        //Prints welcome message
        gameInstruc.printText(1);

        //Asks player to choose dice
        gameInstruc.printText(7);

        diceFaces = input.nextInt();
        diceCup.chooseDie(diceFaces);
        input.nextLine(); // random scanner cause or else it jumps right over the next input.nextLine() and idno why

        int winningBalance = 300;
        while(player1Balance < winningBalance && player2Balance < winningBalance) {
            boolean nextTurn;
            do {
                nextTurn = true;
                //THROWS THE DICE AND PRINTS SQUARE DESCRIPTION ACCORDINGLY
                System.out.println();
                gameInstruc.printText(2); // Prints Player 1 turn text
                input.nextLine();
                currentSum = diceCup.getSum();
                squareDescrip.printText(currentSum);

                //GETS THE VALUE OF THE SQUARE
                pointsValue = board.getPointValue(currentSum);
                player1.setPoints(pointsValue);
                player1Balance = player1.getBalance();
                player1.printBalance();


                if (currentSum == 10) {
                    nextTurn = false;
                    gameInstruc.printText(9);
                }

            } while (!nextTurn);

            if (player1Balance >= winningBalance) {
                //System.out.println("Player 1 you win!");
                break;
            }

            do {
                nextTurn = true;
                //THROWS THE DICE AND PRINTS SQUARE DESCRIPTION ACCORDINGLY
                System.out.println();
                gameInstruc.printText(3); // Prints Player 2 turn text
                input.nextLine();
                currentSum = diceCup.getSum();
                squareDescrip.printText(currentSum);

                //GETS THE VALUE OF THE SQUARE
                pointsValue = board.getPointValue(currentSum);
                player2.setPoints(pointsValue);
                player2Balance = player2.getBalance();
                player2.printBalance();

                if (currentSum == 10) {
                    nextTurn = false;
                    gameInstruc.printText(9);
                }

            } while (!nextTurn);
        }
    }
}
