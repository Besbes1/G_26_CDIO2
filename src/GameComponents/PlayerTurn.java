package GameComponents;

import java.util.Scanner;
import gui_main.GUI;

public class PlayerTurn {
    // Square 2:    Deposit: 250
    // Square 3:    Withdraw: 100
    // Square 4:    Deposit: 100
    // Square 5:    Withdraw: 20
    // Square 6:    Deposit: 180
    // Square 7:    Do nothing
    // Square 8:    Withdraw: 70
    // Square 9:    Deposit 60
    // Square 10:   Withdraw: 80
    // Square 11:   Withdraw: 50
    // Square 12:   Deposit: 650
    public void move(Player currentPlayer) {

        GUI gui = new GUI();
        Scanner userInput = new Scanner(System.in);
        Square square = new Square();
        Cup Cup = new Cup();
        int Sum = 0;
        int Point = 0;

        System.out.println("\n"+ currentPlayer.getPlayerName() + " it is your turn");
        System.out.println("Press ENTER to roll the dice");

        //userInput.nextLine();

        Sum = Cup.getSum();

        Point = square.moveToSquare(Sum);

        if (Point < 0) {
            int newPoint = Math.abs(Point);
            currentPlayer.takePoints(newPoint);
        } else if (Point > 0) {
            currentPlayer.givePoints(Point);
        } else if (Point == 0) {
            System.out.println("You Didn't earn nor lose any points");
        }

        System.out.println(currentPlayer.getPlayerName() + " you currently have " + currentPlayer.getPoints() + " points");

        if (Sum == 10 ){
            System.out.println(currentPlayer.getPlayerName() + " it is your turn again");
            System.out.println("Press ENTER to roll the dice");

            //userInput.nextLine();

            Sum = Cup.getSum();
            Point = square.moveToSquare(Sum);

            if (Point < 0) {
                int newPoint = Math.abs(Point);
                currentPlayer.takePoints(newPoint);
            } else if (Point > 0) {
                currentPlayer.givePoints(Point);
            } else if (Point == 0) {
                System.out.println("You Didn't earn nor lose any points");
            }

            System.out.println(currentPlayer.getPlayerName() + " you currently have " + currentPlayer.getPoints() + " points");
        }

    }

}
