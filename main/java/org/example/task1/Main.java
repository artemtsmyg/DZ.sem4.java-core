package org.example.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный баланс счета: ");
        double initialBalance = scanner.nextDouble();

        try {
            Account account = new Account(initialBalance);

            System.out.print("Введите сумму депозита: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Введите сумму снятия средств: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);

            System.out.println("Текущий баланс на счете: " + account.getBalance());
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}