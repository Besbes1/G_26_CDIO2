package GameComponents;

import java.io.BufferedReader;
import java.io.FileReader;

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
        if (balance < 0)
            balance = 0;
    }
    public double getBalance()
    {
        //System.out.println(Accountname + "now has " + balance + " points");
        return(balance);
    }

    /*
    public void printText(int index) {
        String[] row = new String[18];
        BufferedReader csvReader;

        try {
            csvReader = new BufferedReader(new FileReader(file));
            for (int i = 0; i < 18; i++) {
                row[i] = csvReader.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

     */
}


