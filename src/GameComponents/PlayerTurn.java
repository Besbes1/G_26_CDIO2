package GameComponents;

import java.util.Scanner;

public class PlayerTurn {
    Text gameInstruction = new Text("src/gametext.csv");
    Cup Cup = new Cup();
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
    public void chooseDie(int diceFaces) {
        Cup.setDie(diceFaces);

    }
    public void move(Player currentPlayer) {

        Scanner userInput = new Scanner(System.in);
        Square square = new Square();

        int Sum = 0;
        int Point = 0;

        System.out.println("\n"+ currentPlayer.getPlayerName() + " " + gameInstruction.returnText(4)); // Prints player turn message
        gameInstruction.printText(5); // Prints Press enter instruction

        userInput.nextLine();

        Sum = Cup.getSum();
        Point = square.moveToSquare(Sum);

        if (Point < 0) {
            int newPoint = Math.abs(Point);
            currentPlayer.takePoints(newPoint);
        } else if (Point > 0) {
            currentPlayer.givePoints(Point);
        } /*else if (Point == 0) {
            gameInstruction.printText(6); // Prints "You Didn't earn nor lose any points", for now square descriptions already contain this info

        }*/
        // Prints out current player's balance
        System.out.printf("%s %s %.0f \n",currentPlayer.getPlayerName(),gameInstruction.returnText(7),currentPlayer.getPoints());

        if (Sum == 10 ){
            System.out.println(currentPlayer.getPlayerName() + "...");
            gameInstruction.printText(8); // Prints Press enter instruction

           userInput.nextLine();

            Sum = Cup.getSum();
            Point = square.moveToSquare(Sum);

            if (Point < 0) {
                int newPoint = Math.abs(Point);
                currentPlayer.takePoints(newPoint);
            } else if (Point > 0) {
                currentPlayer.givePoints(Point);
            } else if (Point == 0) {
                gameInstruction.printText(6); // Prints "You Didn't earn nor lose any points"
            }

            System.out.printf("%s %s %.0f \n",currentPlayer.getPlayerName(),gameInstruction.returnText(7),currentPlayer.getPoints());
        }

    }

}
