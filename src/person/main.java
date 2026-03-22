package person;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        person first = new person();
        first.name = "андрюха подзаборный";
        first.age = 20;
        first.profession = "сварщик епт";
        first.sayInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nа теперь узнаем, что у андрюхи с бабками");
        BankAccount money = new BankAccount();
        money.bank = "sberbank";
        money.balance = 26500;
        System.out.println("на сколько хотите пополнить кошелек?");
        money.SummaNaPopolnenie = scanner.nextInt();
        money.popolnenie();
    }
}
