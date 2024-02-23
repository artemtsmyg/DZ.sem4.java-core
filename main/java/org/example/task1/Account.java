package org.example.task1;

/**
 * Класс для управления банковским счетом
 */
public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма депозита не может быть отрицательной");
        }
        balance += amount;
        System.out.println("Депозит в размере " + amount + " успешно проведен.");
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете. Текущий баланс: " + balance);
        }
        balance -= amount;
        System.out.println("Снятие средств в размере " + amount + " успешно проведено.");
    }

    public double getBalance() {
        return balance;
    }
}
