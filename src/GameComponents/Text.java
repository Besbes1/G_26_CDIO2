package GameComponents;
import java.io.*;

abstract class Text {

    public void row(String file, int index) {
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
        System.out.println(row[index]);
    }

}

class SquareDescription extends Text{
    @Override
    public void row(String file, int index) {
        super.row("src/squaredescriptions", index);
    }
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

//https://www.w3schools.com/java/java_abstract.asp

