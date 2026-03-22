import java.util.ArrayList;
import java.util.Scanner;

//public class дзКоллекции {
//    public static void main() {
//       ArrayList<Integer> number = new ArrayList<>();
//       Scanner scan = new Scanner(System.in);
//       int x;
//       while (true) {
//           System.out.print("введите число: ");
//           x = scan.nextInt();
//           if (x== 0){
//               System.out.print("\nцикл закончен");
//               break;
//           }
//           number.add(x);
//       }
//       System.out.print("\nкол-во чисел: " + number.size());
//       System.out.print("\nвсе числа: ");
//       for (int i = 0; i < number.size(); i++) {
//           System.out.print(number.get(i) + " ");
//       }
//       int max = number.get(0);
//       for (int i = 0; i < number.size(); i++) {
//           if (number.get(i) > max) {
//               max = number.get(i);
//           }
//       }
//       System.out.print("\nмаксимальное число: " + max);
//
//       }
//    }
//
//public static void main(String[] args) {
//    ArrayList<Integer> number = new ArrayList<>();
//    number.add(10);
//    number.add(20);
//    number.add(30);
//    number.add(40);
//    System.out.println(number);
//    int сумма = 0;
//    for (int i = 0; i < number.size(); i++) {
//        сумма = сумма + number.get(i);
//    }
//    System.out.println("сумма всех чисел: " + сумма);
//    }
public class дзКоллекции {
    public static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int x;
        while (true) {
            System.out.println("введите число: ");
            x = scan.nextInt();
            if (x==0){
                System.out.println("цикл закончен");
                break;
            }
            numbers.add(x);
        }
        System.out.println("\nколичество чисел: " + numbers.size());
        System.out.print("\nвсе числа: ");
        for (int i = 0; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        System.out.print("\nмаксимальное число: " + max);
    }
}