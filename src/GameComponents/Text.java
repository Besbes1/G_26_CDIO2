package GameComponents;
import java.io.*;

abstract class Text {

    public void Read(String file) {
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
    }
}

