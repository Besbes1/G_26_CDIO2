package GameComponents;
import java.io.*;

public class Text {

    public void Reader() { String gameTextFile = "src/gametext.csv";
        BufferedReader csvReader;
        String line;

        try {
            csvReader = new BufferedReader(new FileReader(gameTextFile));
            String[] row = new String[10];
            for(int i = 0 ; i < 10 ; i++) {
                row[i] = csvReader.readLine();

            }
            System.out.println(row[1]);
        }
        catch(Exception e) {
            e.printStackTrace();

        }
    }
}
