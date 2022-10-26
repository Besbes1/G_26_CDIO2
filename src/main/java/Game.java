import GameComponents.*;
import jdk.jfr.Description;

import java.io.*;
public class Game {
    public static void main(String[] args) {
        Text text = new Text();
        String welcomeMessage = text.getText(1);
        String playerTurn1 = text.getText(2);

        System.out.println(welcomeMessage + "\n" + playerTurn1);



    }
}
