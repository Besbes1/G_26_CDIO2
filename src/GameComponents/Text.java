package GameComponents;
import java.io.*;

public class Text {
    String file;
    public Text(String file){
        this.file = file;

    }
    public void printText(int index) {
        String[] row = new String[26];
        BufferedReader csvReader;

        try {
            csvReader = new BufferedReader(new FileReader(file));
            for (int i = 0; i < 26; i++) {
                row[i] = csvReader.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println(row[index]);
    }


}
