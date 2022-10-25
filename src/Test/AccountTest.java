package Test;

import GameComponents.Account;
import GameComponents.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {


    Account AccountOne = new Account("lisa");


    @Test
    public void TestThatBalanceWillNeverBeNegativ() {

        int amount = 30;
        AccountOne.setBalance(10);
        AccountOne.withDraw(amount);
        AccountOne.getBalance();



    }
}