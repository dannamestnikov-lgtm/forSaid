package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static account findAccount(int id, ArrayList<account> accounts) {
        for (account a : accounts) {
            if (a.id == id) {
                return a;
            }
        }
        return null;
    }

    static void main(String[] args) {
        ArrayList<account> accounts = new ArrayList<>();
        account names = new account();
        names.id = 7944269;
        names.owner = "Namestnikov";
        names.balance = 23100;
        names.blocked = false;

        account lara = new account();
        lara.id = 8358070;
        lara.owner = "Larisov";
        lara.balance = 12500;
        lara.blocked = false;

        account selivan = new account();
        selivan.id = 1234321;
        selivan.owner = "Selivanov";
        selivan.balance = 19000;
        selivan.blocked = false;

        accounts.add(names);
        accounts.add(lara);
        accounts.add(selivan);

        System.out.println("Текущие пользователи: ");
        for (account a : accounts) {
            System.out.println("\nВладелец: " + a.owner + "\nid: " + a.id);
        }
        boolean cont = true;
        Scanner scan = new Scanner(System.in);
        while (cont) {
            System.out.println("\nВведите счет отправителя: ");
            int From = scan.nextInt();
            System.out.println("\nВведите счет получателя: ");
            int To = scan.nextInt();
            System.out.println("\nВведите сумму перевода: ");
            int amount = scan.nextInt();

            account FromACC = findAccount(From, accounts);
            account ToACC = findAccount(To, accounts);
            if (FromACC == null || ToACC == null) {
                System.out.println("Операция приостановлена. Аккаунт не найден");
            } else {
                FromACC.withdraw(amount);
                ToACC.deposit(amount);

                Transaction t1 = new Transaction();
                t1.fromAccountId = From;
                t1.toAccountId = To;
                t1.amount = amount;
                t1.type = "Перевод";

                System.out.println("\n------Информация о транзакциях------ ");
                t1.printInfo1();
                System.out.println("Хотите совершить повторный перевод? (1 = да, 2 = нет)");
                int answer = scan.nextInt();
                if (answer == 1){
                } else if (answer == 2) {
                    cont = false;
                }else{
                    System.out.println("Ошибка. Введите 1 или 2.");
                }
            }
                System.out.println("\n------Информация о пользователях------ ");
                names.printInfo();
                lara.printInfo();
                selivan.printInfo();
            }
        }
    }
