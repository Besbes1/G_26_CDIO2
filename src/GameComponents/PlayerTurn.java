package GameComponents;

import java.util.Scanner;

public class PlayerTurn {

    public void turn(Player currentPlayer) {

        Text squareDescription = new Text("src/squaredescriptions");
        Scanner userInput = new Scanner(System.in);
        Cup Cup = new Cup();
        int Sum = 0;

        System.out.println(currentPlayer.getPlayerName() + " it is your turn");
        System.out.println("Press ENTER to roll the dice");

        userInput.nextLine();

        Sum=Cup.getSum();

        switch (Sum){
            case 2:
                squareDescription.printText(2);

            case 3:
                squareDescription.printText(3);

            case 4:
                squareDescription.printText(4);

            case 5:
                squareDescription.printText(5);

            case 6:
                squareDescription.printText(6);

            case 7:
                squareDescription.printText(7);

            case 8:
                squareDescription.printText(8);

            case 9:
                squareDescription.printText(9);

            case 10:
                squareDescription.printText(10);

            case 11:
                squareDescription.printText(11);

            case 12:
                squareDescription.printText(12);

            default:
                System.out.println("Error: Dice sum not within the range");
        }






    }

}
