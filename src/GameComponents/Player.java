package GameComponents;


//We are going to reuse the player class from the previous project CDIO1//
public class Player {
    Text gameInstruc = new Text("src/gametext.csv");
    Account bankAccount = new Account();
    private int playerNumber;
    private int points;

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        //System.out.println("Player " + playerNumber);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPoints(int newPoints, boolean isPos) {

        points = newPoints;
        boolean bankAction = isPos;

        if (bankAction){
            bankAccount.deposit(points);

        } else {
            bankAccount.withDraw(points);
        }
    }

    public int getBalance(){
        int newBalance = bankAccount.getBalance();
        return newBalance;
    }

    public void printBalance() {
       gameInstruc.printText(6);
        System.out.println(bankAccount.getBalance());
    }
}

