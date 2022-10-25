package GameComponents;
import java.io.*;

abstract class Text {

    public String[] read(String file) {
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
        return row;
    }

}

class SquareDescription extends Text{
        String[]row=new String[18];

        row=Read("src/squaredescriptions");
        System.out.println(row[sumDice]);
        }


/*
package GameComponents;
import java.io.*;

public class Text {
    public String getText(int index) { String gameTextFile = "src/gametext.csv";
        String[] row = new String[18];
        BufferedReader csvReader;

        try {
            csvReader = new BufferedReader(new FileReader(gameTextFile));
            for(int i = 0 ; i < 18 ; i++) {
                row[i] = csvReader.readLine();

            }

        }
        catch(Exception e) {
            e.printStackTrace();

        }

        return row[index];
    }
}

 */