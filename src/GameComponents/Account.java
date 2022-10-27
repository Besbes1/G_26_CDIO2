package GameComponents;

public class Account {
    private int balance = 10;
    //private String Accountname;

    public void setBalance(int initialBalance){
        balance = initialBalance;
    }
    public void deposit(int amount)
    {
        balance += amount;
    }
    public void withDraw(int amount)
    {
        balance -= amount;
        if (balance < 0)
            balance = 0;
    }
    public int getBalance()
    {
        return balance;
    }
}


