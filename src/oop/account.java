package oop;

public class account {
    int id;
    String owner;
    int balance;
    boolean blocked;
    void deposit(int amount) {
        if (blocked) {
            System.out.println("Счет заблокирован. Пополнение невозможно.");
            return;
        }
        if (amount <= 10) {
            System.out.println("Сумма пополнения должна быть больше 10.");
            return;
        }
        balance += amount;
        System.out.println("Счет успешно пополнен на " + amount);
    }
    void withdraw(int amount) {
        if (blocked) {
            System.out.println("Счет заблокирован. Снятие невозможно.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Сумма снятия должна быть больше 0.");
            return;
        }
        if (amount > balance) {
            System.out.println("Недостаточно средств на счете.");
            return;
        }
        balance -= amount;
    }
    void block() {
        blocked = true;
        System.out.println("Счет заблокирован.");
    }
    void unblock() {
        blocked = false;
        System.out.println("Счет разблокирован.");
    }
    void printInfo() {
        System.out.println("\nИнформация о счете: ");
        System.out.println("ID счета: " + id);
        System.out.println("Владелец: " + owner);
        System.out.println("Баланс: " + balance);
        System.out.println("Статус: " + (blocked ? "Заблокирован" : "Активен"));

    }
}

