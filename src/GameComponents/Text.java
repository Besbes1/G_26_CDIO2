package GameComponents;
import java.io.*;

abstract class Text {
    public String getText(int index) { String gameTextFile = "src/gametext.csv";
        String[] row = new String[10];
        BufferedReader csvReader;

        try {
            csvReader = new BufferedReader(new FileReader(gameTextFile));
            for(int i = 0 ; i < 10 ; i++) {
                row[i] = csvReader.readLine();

            }

        }
        catch(Exception e) {
            e.printStackTrace();

        }

        return row[index];
    }
}
