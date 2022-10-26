package GameComponents;

public class Square {
    // definere et array med alle første kast af terningen
    private int[] pointArray = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650, -500, 350, -700, 100, 75, 0, 140, 60, 50, 100, 40, 100};


    public int getPointValue(int diceSum) {

        int i = pointArray[diceSum - 2];
        return i;

    }
}
