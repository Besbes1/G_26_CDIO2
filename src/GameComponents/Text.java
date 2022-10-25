package GameComponents;
import java.io.*;

abstract class Text {

    private String Read(String file) {
        String gameTextFile = file;
        String[] row = new String[18];
        BufferedReader csvReader;

        try {
            csvReader = new BufferedReader(new FileReader(gameTextFile));
            for (int i = 0; i < 18; i++) {
                row[i] = csvReader.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return row[index];
    }

    public void printDescription(String sumDice) {

    }
}

