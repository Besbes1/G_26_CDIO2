package GameComponents;


//We are going to reuse the player class from the previous project CDIO1//
public class Player {
    Account bankAccount = new Account("Player Account");
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
        if (points < 0){
            bankAccount.withDraw(points);

        } else {
            bankAccount.deposit(points);
        }
    }

    public int getBalance(){

        return points;
    }

    public void printBalance() {
        int newBalance = bankAccount.getBalance();
        System.out.println("Player " + playerNumber + " now has " + newBalance + " in their bank account." );
    }
}

