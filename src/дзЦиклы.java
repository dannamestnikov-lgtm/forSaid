public class дзЦиклы {
    public static void main(String[] args) {
        System.out.println("все числа: ");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("\nчетные числа: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
            System.out.println("\nнечетные числа: ");
            for (int i = 0; i <= 20; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }

public static void main(String[] args) {
    System.out.print("все числа: ");
    for (int i = 1; i <= 20; i++) {
        System.out.print(i + " ");
    }
    int суммаЧетных = 0;
    System.out.print("\nчетные числа: ");
    for (int i = 1; i <= 20; i++) {
        if (i % 2 == 0) {
            суммаЧетных = суммаЧетных + i;
            System.out.print(i + " ");
        }
    }
    System.out.print("\nсумма четных значений: " + суммаЧетных);
    System.out.print("\nнечетные числа: ");
    for (int i = 1; i <= 20; i++) {
        if (i % 2 == 1) {
            System.out.print(i + " ");
        }
    }
}
