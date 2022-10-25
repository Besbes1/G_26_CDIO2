package Test;

import GameComponents.Die;
import org.junit.Test;

import static org.junit.Assert.*;

public class DieTest {

    Die dice = new Die();
    @Test
    public void TestThatDiceFaceValueIsBetweenOneAndSix() {

        switch (dice.roll()){

            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            default:
                fail();
        }

    }
}