package org.example.task2;

import org.example.task1.InsufficientFundsException;

public class Program {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(1000.0);
        DebitAccount debitAccount = new DebitAccount(500.0);

        try {
            System.out.println("Текущий баланс кредитного счета: " + creditAccount.getBalance());
            System.out.println("Текущий баланс дебетового счета: " + debitAccount.getBalance());

            Transaction.transfer(creditAccount, debitAccount, 200.0);

            System.out.println("Текущий баланс кредитного счета после перевода: " + creditAccount.getBalance());
            System.out.println("Текущий баланс дебетового счета после перевода: " + debitAccount.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка транзакции: " + e.getMessage());
        }
    }
}
