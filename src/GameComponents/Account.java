package GameComponents;

public class Account {
    Text gameInstruc = new Text("src/gametext.csv");
    private int balance = 1000;
    //private String Accountname;

    public void setBalance(int initialBalance){
        balance = initialBalance;
    }
    public void deposit(int amount) {
        balance += amount;

    }
    public void withDraw(int amount) {

        balance -= amount;
        if (balance < 0) {
            gameInstruc.printText(12);
            balance = 0;
        }
    }
    public int getBalance()
    {
        return balance;
    }
}


