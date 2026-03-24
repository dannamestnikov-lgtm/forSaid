import java.util.Scanner;

public class дзУсловныеКонструкции {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("какую ты получил оценку по математике? ");
        int оценка = scan.nextInt();
        if (оценка == 5) {
            System.out.println("это впечатляет, не знал что ты умеешь хотя бы считать");
        }
        if (оценка == 4) {
            System.out.println("хорошо, джонатан");
        }
        if (оценка == 3) {
            System.out.println("я расстроен, джони");
        }
        if (оценка == 2) {
            System.out.println("позор");
        }
        if (оценка > 5 || оценка == 1) {
            System.out.println("очень смешно, а если честно?");
        }
    }
}

//public void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.println("какая у вас была оценка по алгебре? ");
//    int оценка = scan.nextInt();
//    if (оценка == 5) {
//        System.out.println("здорово, джеймс. я не ожидал");
//    }
//    if (оценка == 4) {
//        System.out.println("вполне неплохо, но я заню ты можешь лучше");
//    }
//    if (оценка == 3) {
//        System.out.println("мда, твой отец учился без троек");
//    }
//    if (оценка == 2) {
//        System.out.println("вон из дома джеймс");
//    }
//    if (оценка > 5 || оценка <= 1){
//        System.out.println("очень смешно");
//    }
//}
