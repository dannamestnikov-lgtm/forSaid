package day05.model;

public class BankAccount {
    private int id;
    private String ownerName;
    private int balance;
    public BankAccount(int id, String ownerName, int balance){
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public void deposit(int amount){
        if (amount <= 0) {
            System.out.println("ошибка. сумма должна быть больше 0");
        } else {
            balance = balance + amount;
            System.out.println("Текущий баланс: " + balance);
        }
    }

    public void withdraw(int amount){
        if (amount <= 0){
            System.out.println("ошибка. сумма должна быть больше 0");
            return;
        }
        if (amount > balance){
            System.out.println("ошибка. слишком большая сумма операции");
            return;
        }
            balance = balance - amount;
            System.out.println("текущий баланс: " + balance);
        }
    public void printInfo(){
        System.out.println("\nID владельца: " + id + "\nИмя владельца: " + ownerName + "\nБаланс: " + balance + " \n");
    }
    public void transfer (BankAccount other, int amount){
        if (amount <= 0){
            System.out.println("сумма должна быть больше нуля");
            return;
        }
        if (amount > balance){
            System.out.println("ошибка. слишком большая сумма");
            return;
        }
        this.withdraw(amount);
        other.deposit(amount);
        System.out.println("перевод выполнен");
        }

    }

