package org.example.task2;

import org.example.task1.Account;
import org.example.task1.InsufficientFundsException;

/**
 * Класс для транзакций между счетами
 */
class Transaction {
    public static void transfer(Account fromAccount, Account toAccount, double amount) throws InsufficientFundsException {
        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Перевод на сумму " + amount + " успешно выполнен.");
        } catch (InsufficientFundsException e) {
            throw new InsufficientFundsException("Ошибка при переводе: " + e.getMessage());
        }
    }
}
