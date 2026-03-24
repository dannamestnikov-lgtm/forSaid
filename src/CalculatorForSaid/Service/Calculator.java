package CalculatorForSaid.Service;

public class Calculator {
    public int plus(int num1, int num2) {
        int summa = num1 + num2;
        System.out.println("Операция выполнена успешно. Результат: " + summa);
        return summa;
    }

    public int minus(int num1, int num2) {
        int difference = num1 - num2;
        System.out.println("Операция выполнена успешно. Результат: " + difference);
        return difference;
    }

    public int ymnozh(int num1, int num2) {
        int multiplication = num1 * num2;
        System.out.println("Операция выполнена успешно. Результат: " + multiplication);
        return multiplication;
    }

    public int delenie(int num1, int num2) {
        if (num2 != 0) {
            int division = num1 / num2;
            System.out.println("Операция выполнена успешно. Результат: " + division);
            return division;
        } else {
            System.out.println("делить на 0 нельзя");
            return 0;
        }
    }
}

