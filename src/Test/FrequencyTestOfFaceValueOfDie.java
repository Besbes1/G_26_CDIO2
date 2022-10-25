package Test;

import GameComponents.Die;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyTestOfFaceValueOfDie {

    Die dice = new Die();

    @Test
    public void TotalOfFaceValue() {

        int faceValue_1 = 0;
        int faceValue_2 = 0;
        int faceValue_3 = 0;
        int faceValue_4 = 0;
        int faceValue_5 = 0;
        int faceValue_6 = 0;

        for (int i = 0; i < 60000; i++) {

            switch (dice.roll()){

                case 1:
                    faceValue_1 ++;
                    break;
                case 2:
                    faceValue_2 ++;
                    break;
                case 3:
                    faceValue_3 ++;
                    break;
                case 4:
                    faceValue_4 ++;
                    break;
                case 5:
                    faceValue_5 ++;
                    break;
                case 6:
                    faceValue_6 ++;
                    break;



            }


        }

        assertEquals(10000,faceValue_1,0.1);
        assertEquals(10000,faceValue_2,0.1);
        assertEquals(10000,faceValue_3,0.1);
        assertEquals(10000,faceValue_4,0.1);
        assertEquals(10000,faceValue_5,0.1);
        assertEquals(10000,faceValue_6,0.1);

    }
}