package GameComponents;
/*
===================================================================================
This class is reused from our previous project CDIO 1 and translated to English.
===================================================================================
 */
public class Die {
    private int sides;
    private int resultRoll;  // GEMMER VÆRDI FOR TERNINGEN EFTER KASTET

    public Die(int sides){

        this.sides = sides;
    }

    public int roll() {  //  GENERATES A RANDOM INTEGER BETWEEN 1 AND THE AMOUNT OF SIDES CHOSEN
        final int diceFaces = sides ;
        resultRoll = (int)(Math.random() * diceFaces ) + 1;
        return resultRoll;
    }

    public String toString() {
        String rollString = Integer.toString(resultRoll);
        return rollString;
    }
}

