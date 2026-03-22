package day05.app;

import day05.model.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1, "Names", 10000);
        BankAccount acc2 = new BankAccount(2, "Vasin", 40000);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму операции: ");
        acc1.deposit(scan.nextInt());
        System.out.println("Введите сумму операции: ");
        acc1.withdraw(scan.nextInt());
        acc1.printInfo();
        acc2.transfer(acc1, 8000);
    }
}
