package day02.util;

import java.util.Scanner;

public class InputHelper {
    public static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        int value = scan.nextInt();
        return value;
    }
    public static int readPositiveInt(Scanner scan, String prompt){
        while(true){
            System.out.println(prompt);
            int value = scan.nextInt();
            if (value > 0) {
                return value;
            }
            System.out.println("Введите число");
        }
    }
}
