package GameComponents;


//We are going to reuse the player class from the previous project CDIO1//
public class Player {

    private String playerName;
    private double points;
    Account PlayerAccount = new Account(playerName);

    public Player(String playerName, int points) {
        this.playerName = playerName;
        this.points = points;
        //System.out.println(playerName);
        PlayerAccount.setBalance(points);

    }

    /*
    public int getPlayerNumber() {
        return playerNumber;
    }

     */

    public void takePoints(double newPoints) {
        PlayerAccount.withDraw(newPoints);
    }

    public void givePoints(double newPoints){
        PlayerAccount.deposit(newPoints);
    }

    public double getPoints(){
        //System.out.println(PlayerAccount.getBalance());
        return (PlayerAccount.getBalance());
    }

    public String getPlayerName (){
        return playerName;
    }
}