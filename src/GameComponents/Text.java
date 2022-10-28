package GameComponents;
import java.io.*;

public class Text {
    String file;
    public Text(String file){
        this.file = file;
    }
    public void printText(int index) {
        String[] row = new String[25];
        BufferedReader csvReader;

        try {
            csvReader = new BufferedReader(new FileReader(file));
            for (int i = 0; i < row.length; i++) {
                row[i] = csvReader.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println(row[index]);
    }

    public String returnText(int index) {
        String[] row = new String[18];
        BufferedReader csvReader;

        try {
            csvReader = new BufferedReader(new FileReader(file));
            for (int i = 0; i < 18; i++) {
                row[i] = csvReader.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return row[index];
    }


}

