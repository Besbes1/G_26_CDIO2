package GameComponents;
/*
===================================================================================
This class is reused from our previous project CDIO 1 and translated to English.
===================================================================================
 */
public class Cup {
    Die die1 = new Die();
    Die die2 = new Die();




    public int getSum () { // henter værdien af hver de to terninger og lægger dem sammen
        int d1 = die1.roll();
        int d2 = die2.roll();
        System.out.println("First die: " + d1 + " and second die: " + d2);
        int sum;
        sum = d1 + d2;
        return sum;
    }
}
