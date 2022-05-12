package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {

    @Test
    public void notEnoughFunds() {

        BankAccount bankAccount = new BankAccount(5);
        System.out.println("Exception occurred");
        assertThrows(NotEnoughFundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                bankAccount.withdraw(10);
            }
        });
        // OR
        //assertThrows(NotEnoughFundsException.class, ()->{bankAccount.withdraw(20);});
    }

    @Test
    public void enoughFunds() {

        BankAccount bankAccount = new BankAccount(100);

        System.out.println("No exception thrown");
        assertDoesNotThrow(()->{bankAccount.withdraw(20);});


    }
}
