import java.util.Scanner;

public class дзСканер {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите ваше имя: ");
        String имя = scan.nextLine();
        System.out.println("введите ваш возраст: ");
        int возраст = scan.nextInt();
        System.out.println("введите ваше любимое число: ");
        int число = scan.nextInt();
        System.out.println("Приветствую дорогой " + имя);
        System.out.println("тебе через 5 лет будет уже " + (возраст + 5));
        System.out.println("если твоё любимое число сделать в квадрате будет " + (число * число));
    }
}
//    public static void main(String[] args) {
//Scanner scan = new Scanner(System.in);
//        System.out.println("введите ваше имя: ");
//        String имя = scan.nextLine();
//        System.out.println("введите ваш возраст: ");
//        int возраст = scan.nextInt();
//        System.out.println("введите ваше любимое число: ");
//        int число = scan.nextInt();
//        System.out.println("добро пожаловать дорогой " + имя + "\nваш возраст через 5 лет будет - " + (возраст + 5) + "\nваше любимое число в кадрате - " + (число*число));
//    }

