package person;

import java.util.Scanner;

public class BankAccount {
    Scanner scan = new Scanner(System.in);
    int SummaNaPopolnenie;
    String bank;
    int balance;

    void popolnenie(){
        int schet = 0;
        System.out.println("банк которым вы пользуетесь: " + bank + "\nбаланс до пополнения:" + balance);
        schet = balance += SummaNaPopolnenie;
        System.out.println("\nваш текущий счет: " + schet);
    }
}
