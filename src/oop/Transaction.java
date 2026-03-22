package oop;

public class Transaction {
    int fromAccountId;
    int toAccountId;
    int amount;
    String type;

    void printInfo1() {
        System.out.println("\nТип: " + type);
        System.out.println("Счет откуда: " + fromAccountId);
        System.out.println("Счет куда: " + toAccountId);
        System.out.println("Сумма: " + amount);
    }
}

