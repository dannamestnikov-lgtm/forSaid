import java.util.Scanner;

public class дзМассивы2 {
//    static void main(String[] args) {
//        int[] массив = new int[5];
//        Scanner scan = new Scanner(System.in);
//        String[] порядковые = {"первую ", "вторую ", "третью ", "четвертую ", "пятую "};
//        for (int i = 0; i < массив.length; i++) {
//            System.out.println("введите вашу " + порядковые[i] + "оценку: ");
//            массив[i] = scan.nextInt();
//        }
//        System.out.println("все введённые оценки: ");
//        for (int i = 0; i < массив.length; i++) {
//            System.out.print(массив[i] + " ");
//
//        }
//        System.out.println("\nчётные оценки: ");
//        for (int i = 0; i < массив.length; i++) {
//            if (массив[i] % 2 == 0) {
//                System.out.print(массив[i] + " ");
//
//            }
//        }
//        System.out.println("\nнечётные оценки: ");
//        for (int i = 0; i < массив.length; i++) {
//            if (массив[i] % 2 == 1) {
//                System.out.print(массив[i] + " ");
//            }
//        }
//        int сумма = 0;
//        for (int i = 0; i < массив.length; i++) {
//            сумма = сумма + массив[i];
//        }
//        System.out.println("\nсумма всех оценок: " + сумма);
//
//        int сумма1 = 0;
//        for (int i = 0; i < массив.length; i++) {
//            сумма1 = сумма % 5;
//        }
//        double среднийБалл = (double) сумма / массив.length;
//
//        System.out.println("\nположительные оценки: ");
//        for (int i = 0; i < массив.length; i++) {
//            if (массив[i] > 3) {
//                System.out.print(массив[i] + " ");
//            }
//        }
//                int суммаХороших = 0;
//                for (int i = 0; i < массив.length; i++) {
//                    if (массив[i] > 3) {
//                        суммаХороших++;
//                    }
//                }
//                        System.out.println("\nвсего хороших оценок: " + суммаХороших);
//                    }
//            }

    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] оценки = new int[5];
        String[] порядок = {"первую ", "вторую ", "третью ", "четвертую ", "пятую "};
        for (int i = 0; i < оценки.length; i++) {
            System.out.print("введите вашу " + порядок[i] + "оценку: ");
            оценки[i] = scan.nextInt();
        }
        System.out.print("\nвсе ваши оценки: ");
        for (int i = 0; i < оценки.length; i++) {
            System.out.print(оценки[i] + " ");
        }
        System.out.print("\nчетные оценки: ");
        for (int i = 0; i < оценки.length; i++) {
            if (оценки[i] % 2 == 0) {
                System.out.print(оценки[i] + " ");
            }
        }
        int сумма = 0;
        for (int i = 0; i < оценки.length; i++) {
            сумма = сумма + оценки[i];
        }
        System.out.print("\nсумма всех оценок: " + сумма);
        int Суммахороших = 0;
        for (int i = 0; i < оценки.length; i++) {
            if (оценки[i] > 3) {
                Суммахороших++;
            }
        }
                System.out.print("\nХороших оценок: " + Суммахороших + " ");
        System.out.print("\nа именно ты получал: ");
        for (int i = 0; i < оценки.length ; i++) {
         if (оценки[i] > 3) {
          System.out.print(оценки[i] + " ");
            }
        }
            }
        }













