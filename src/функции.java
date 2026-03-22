import java.util.Scanner;

public class функции {
    public static void main(String[] args) {
//        int[] numbers = {7, 8, 13, 5, 3};
//        int summa = summaCode(numbers);
//        System.out.println("сумма всех чисел: " + summa);
//    }
//
//    public static int summaCode(int[] num) {
//        int summaCode = 0;
//        for (int i = 0; i < num.length; i++) {
//            summaCode += num[i];
//        }
//        return summaCode;

        int[] numbers = {5, 7, 9, 4};
        int summa = summaCode(numbers);
        System.out.println("сумма всех чисел: " + summa);
    }

    public static int summaCode (int[] num){
    int summaCode = 0;
        for (int i = 0; i < num.length; i++) {
            summaCode += num[i];
        }
        return summaCode;

        }
    }
