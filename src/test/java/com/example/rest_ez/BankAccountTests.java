package com.example.rest_ez;

import com.example.rest_ez.models.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTests {

    @Test
    public void testGetAccountBalance(){
        // Arrange
        BankAccount bankAccount = new BankAccount(1000);



        // Act
        int expected = 2000;
        bankAccount.deposit(1000);
        int actual = bankAccount.getBalance();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDepositBalanceToAccount() throws Exception {
        throw new Exception("Not implemented");
    }

    @Test
    public void testWithdrawBalanceFromAccount() throws Exception {
        throw new Exception("Not implemented");
    }

    @Test
    public void testWithdrawTooHighAmount(){
        // Arrange
        BankAccount bankAccount = new BankAccount(1000);

        // Act
        bankAccount.withdraw(2000);
    }
}
