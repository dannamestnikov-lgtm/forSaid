package day04.app;

import day04.service.GreetingService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GreetingService gr = new GreetingService();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nКакую операцию желаете реализовать? \n1 - просто привет \n2 - привет + имя \n3 - привет + имя несколько раз \n4 - привет + имя + статус \n0 - выход");
            String choice = scan.nextLine();
            if (choice.equals("0")){
                System.out.println("вы успешно вышли");
                break;
            }
            switch (choice) {
                case "1":
                    gr.greet();
                    continue;
                case "2":
                    gr.greet("vasil");
                    continue;
                case "3":
                    gr.greet("pet", 3);
                    continue;
                case "4":
                    gr.greet("dan", "admin");
                    continue;
                default:
                    System.out.println("такой команды нет");
                    continue;
            }
        }
    }
    }