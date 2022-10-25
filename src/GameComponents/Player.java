package GameComponents;


//We are going to reuse the player class from the previous project CDIO1//
public class Player {

    private int playerNumber;
    private int points;

    public Player(int playerNumber, int points) {
        this.playerNumber = playerNumber;
        this.points = points;
        System.out.println("Player " + playerNumber);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPoints(int newPoints) {
        points = newPoints;
    }

    public int getPoints(){
        return points;
    }
}