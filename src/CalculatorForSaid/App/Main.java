package CalculatorForSaid.App;

import CalculatorForSaid.Service.Calculator;
import CalculatorForSaid.Service.Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Converter con = new Converter();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scan.nextInt();
        System.out.println("Выберите операцию (+ - * /)");
        String operation = scan.next();
        System.out.println("Введите второе число");
        int num2 = scan.nextInt();
        System.out.println(con.printOperationText(cal, con, num1, num2, operation));
    }
}