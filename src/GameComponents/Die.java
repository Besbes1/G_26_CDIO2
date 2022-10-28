package GameComponents;
/*
===================================================================================
This class is reused from our previous project CDIO 1 and translated to English.
===================================================================================
 */
public class Die {
    private int sides;
    private int resultRoll;  // GEMMER VÆRDI FOR TERNINGEN EFTER KASTET

    public void setSides(int sides) {
        this.sides = sides;
    };
    public int roll() {  // GENERERER ET TILFÆLDIGT INTEGER MELLEM 1 OG 6
        //final int diceFaces = 6 ;  // ANGIVER MAKS ANTAL AF SIDER FOR TERNINGEN
        resultRoll = (int)(Math.random() * sides ) + 1;
        return resultRoll;
    }

    public String toString() {
        String rollString = Integer.toString(resultRoll);
        return rollString;
    }
}

