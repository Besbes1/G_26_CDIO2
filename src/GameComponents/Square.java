package GameComponents;

public class Square {
    // definere et array med alle første kast af terningen
    int[] intarray;

    public Square() {
        intarray = new int[]{250, -100, 100, -20, 180, 0, -70, 60, -80,-50,650};
    }

    public int[] getPointValue() {
        return intarray;
    }



}
