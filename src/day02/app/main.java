package day02.app;

import day02.util.ArrayStats;
import day02.util.InputHelper;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayStats arr = new ArrayStats();
        Scanner scan = new Scanner(System.in);
        int n = InputHelper.readPositiveInt(scan, "Введите количество чисел");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = InputHelper.readInt(scan, "Введите число");
        }
        arr.allNums(numbers);
        arr.positive(numbers);
        arr.negative(numbers);
        System.out.print("\nСумма всех значений: \n" + arr.summa(numbers));
        System.out.print("\nМинимальное значение: \n" + arr.min(numbers));
        System.out.print("\nМаксимальное значения: \n" + arr.max(numbers));
        System.out.print("\nСреднее значение: \n" + arr.average(numbers));
        System.out.print("\nКоличество положительных значений: \n" + arr.countPositive(numbers));
        System.out.print("\nКоличество отрицательных значений: \n" + arr.countNegative(numbers));
        System.out.print("\nКоличество значений равных нулю: \n" + arr.countZero(numbers));
        System.out.print("\nКоличество четных значений: \n" + arr.countChet(numbers));
        System.out.print("\nКоличество нечетных значений: \n" + arr.countNechet(numbers));
    }
}
