package GameComponents;
/*
===================================================================================
This class is reused from our previous project CDIO 1 and translated to English.
===================================================================================
 */
public class Cup {
    private int diceFaces; // MAXIMUM AMOUNT OF FACES PER DIE PERMITTED IS 12
    Die die1 = new Die();
    Die die2 = new Die();

    public void chooseDie(int diceFaces) {
        die1.setSides(diceFaces);
        die1.setSides(diceFaces);
    }


    public int getSum () { // GETS VALUE OF EACH DIE AND RETURNS THE SUM OF THE TWO
        int d1 = die1.roll();
        int d2 = die2.roll();
        System.out.println("First die: " + d1 + " and second die: " + d2);
        int sum;
        sum = d1 + d2;
        return sum;
    }
}
