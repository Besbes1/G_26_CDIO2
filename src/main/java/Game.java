import java.util.Scanner;
import GameComponents.*;
import gui_main.GUI;

public class Game {
    public static void main(String[] args) {

        Die die_1 = new Die();
        Die die_2 = new Die();


        GUI gui = new GUI();
        gui.setDice(die_2.roll(),die_2.roll());

    }
}
