package GameComponents;
/*
===================================================================================
This class is reused from our previous project CDIO 1 and translated to English.
===================================================================================
 */
public class Die {
    private int resultRoll;  // GEMMER VÆRDI FOR TERNINGEN EFTER KASTET

    public int roll() {  // GENERERER ET TILFÆLDIGT INTEGER MELLEM 1 OG 6
        final int diceFaces = 6 ;  // ANGIVER MAKS ANTAL AF SIDER FOR TERNINGEN
        resultRoll = (int)(Math.random() * diceFaces ) + 1;
        return resultRoll;
    }

    public String toString() {
        String rollString = Integer.toString(resultRoll);
        return rollString;
    }
}

