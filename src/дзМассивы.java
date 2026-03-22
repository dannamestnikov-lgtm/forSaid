import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class дзМассивы {
    public static void main(String[] args) {
       int [] оценки = new int[5];
       Scanner scan = new Scanner(System.in);
        for (int i = 0; i < оценки.length ; i++) {
            System.out.println("Оценки в дневнике " + (i + 1) + ":");
            оценки[i] = scan.nextInt();
        }
        System.out.print("все оценки: ");
        for (int i = 0; i < оценки.length; i++) {
            System.out.print(оценки[i] + " ");
        }
        System.out.print("\nчетные оценки: ");
       for (int i = 0; i < оценки.length; i++) {
          if (оценки[i] % 2 == 0){
               System.out.print(оценки[i] + " ");
           }
       }

       int сумма = 0;
        for (int i = 0; i < оценки.length ; i++) {
            сумма += оценки[i];
        }
        System.out.print("\nсумма всех оценок: " + сумма);
           }
        }

