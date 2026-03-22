package day06.app;

import day06.model.User;
import day06.service.UserRegistry;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       UserRegistry registry = new UserRegistry();
       User u1 = registry.register("Danila");
       User u2 = registry.register("vasya", "shlypa.com");
       User u3 = registry.register("Cherv");
       User u4 = registry.register("savva", "@drochillo.com");
       User u5 = registry.register("antip");
       registry.showUsers();

       Scanner scan = new Scanner(System.in);
       System.out.println("Введите id пользователя, которого желаете найти:");
       registry.findById(scan.nextInt());
       scan.nextLine();
       System.out.println("введите адрес почты, которую хотите проверить: ");
       registry.isemailtaken(scan.nextLine());
    }
}
