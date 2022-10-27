package GameComponents;
/*
===================================================================================
This class is reused from our previous project CDIO 1 and translated to English.
===================================================================================
 */
public class Die {
    private int sides;
    private int resultRoll;  // SAVES THE VALUE OF THE DIE AFTER ROLL

    public Die(){
    }

    public void setSides(int sides) {
        this.sides = sides;
        //System.out.println("You chose a D" + this.sides); //OBS TO BE ADDED TO GAMETEXT.CSV+PUT IN GAME!!!
    }
    public int roll() {  //  GENERATES A RANDOM INTEGER BETWEEN 1 AND THE AMOUNT OF SIDES CHOSEN
        //final int diceFaces = sides ;
        resultRoll = (int)(Math.random() * sides ) + 1;
        return resultRoll;
    }

    public String toString() {
        String rollString = Integer.toString(resultRoll);
        return rollString;
    }
}

