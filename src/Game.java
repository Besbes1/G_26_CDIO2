import GameComponents.*;
import java.io.*;
public class Game {
    public static void main(String[] args) {
        String gameTextFile = "src\\gametext.csv";
        BufferedReader csvReader;
        String line;

        try {
            csvReader = new BufferedReader(new FileReader(gameTextFile));
            while((line = csvReader.readLine()) != null) {
                String[] row = line.split("\n");

                for(String index : row) {
                    System.out.printf(index);
                }
                System.out.println();
            }

        }
        catch(Exception e) {
            e.printStackTrace();

        }

    }
}
