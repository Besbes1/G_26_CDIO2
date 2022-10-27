package GameComponents;

public class Square {
    // definere et array med alle første kast af terningen
    private int[] pointArray = {250, 100, 100, 20, 180, 0, 70,
            60, 80, 50, 650, 500, 350, 100,
            100, 75, 0, 140, 60, 50, 100,
            40, 700};

    private boolean[] positiveValue = {true, false, true, false, true, true, false,
            true, false, false, true, false, true, true,
            true, true, true, false, true, true, true,
            true, false};
    public int getPointValue(int diceSum) {
        int i = pointArray[diceSum - 2];
        return i;

    }
    public boolean isPositive(int diceSum) {
        boolean i = positiveValue[diceSum - 2];
        return i;

    }


}
