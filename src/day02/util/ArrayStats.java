package day02.util;

public class ArrayStats {

    public void allNums(int[] numbers) {
        System.out.println("Все значения массива: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public int summa(int[] numbers) {
        int n1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            n1 = numbers[i] + n1;
        }
        return n1;
    }

    public int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public double average(int[] numbers) {
        return (double) summa(numbers) / numbers.length;
    }

    public int countPositive(int[] numbers) {
       int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){
                count ++;
            }
        }
        return count;
    }

    public void positive(int[] numbers) {
        System.out.print("\nВсе положительные значения: \n");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public int countNegative(int[] numbers){
        int negative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                negative ++;
            }
        }
        return negative;
    }

    public void negative(int[] numbers){
        System.out.print("\nВсе отрицательные значения: \n");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public int countZero(int[] numbers){
        int zero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                zero ++;
            }
        }
        return zero;
    }

    public int countChet(int[] numbers){
        int chet = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                chet ++;
            }
        }
        return chet;
    }

    public int countNechet(int[] numbers){
        int neg = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                neg ++;
            }
        }
        return neg;
    }
}