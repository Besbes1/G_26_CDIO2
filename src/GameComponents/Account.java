package GameComponents;

public class Account {
    private double balance;
    private String Accountname;

    public Account(String name){
        balance = 0;
        Accountname = name;
    }
    public void setBalance(double initialBalance){
        balance = initialBalance;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withDraw(double amount)
    {
        balance -= amount;
    }
    public void getBalance()
    {
        System.out.println(Accountname + "now has " + balance + " points");
    }
}


