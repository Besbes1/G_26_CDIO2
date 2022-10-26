import GameComponents.*;

public class Game {
    public static void main(String[] args) {
        Text gameInstruc = new Text("src/gametext.csv");
        Text squareDescrip = new Text("src/squaredescriptions");

        //Prints welcome message
        gameInstruc.printText(1);

        //Prints description of square 2
        squareDescrip.printText(2);

    }
}
