package day01.app;

import day01.util.Calculator;
import day01.util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator cal = new Calculator();
        CurrencyConverter con = new CurrencyConverter();
        while (true) {
            System.out.println("\nВыберите тип операции: ");
            System.out.println("1) + \n2) - \n3) * \n4) / \n5) RUB -> EUR");
            System.out.println("0 - выход");
            String operation = scan.next();
            if (operation.equals("0")){
                break;
            }
            if (operation.equals("5")){
                System.out.println("Введите число, которое хотите обменять на евро: ");
                double res;
                double rub = scan.nextDouble();
                res = CurrencyConverter.rubToEur(rub);
                System.out.println("Вы имеете " + res + " евро");
                continue;
            }
            System.out.println("Введите первое число: ");
            double a = scan.nextDouble();
            System.out.println("Введите второе число: ");
            double b = scan.nextDouble();
            double result = 0;
            switch (operation){
                case "1":
                    result = cal.add(a, b);
                    break;
                case "2":
                    result = cal.sub(a, b);
                    break;
                case "3":
                    result = cal.mul(a, b);
                    break;
                case "4":
                    if (b == 0){
                        System.out.println("Ошибка. Делить на 0 нельзя");
                        continue;
                    } else {
                        result = cal.div(a, b);
                        break;
                    }

                default:
                    System.out.println("неизвестная операция");
                    continue;
            }
            System.out.println("Результат: " + result);

        }
        System.out.println("Программа завершена");
    }
}
