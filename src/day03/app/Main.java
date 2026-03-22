//package day03.app;
//
//import day03.service.ShoppingList;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        ShoppingList list = new ShoppingList();
//        while (true) {
//            System.out.println("\nчто хотите сделать сделать? \n1 - Положить товар в корзину \n2 - Посмотреть список товаров в корзине \n3 - Удалить товар из корзины \n4 - очистить всю корзину \n5 - сортировать корзину \n0 - выйти из магазина");
//            String choice = scan.nextLine();
//            if (choice.equals("0")){
//                System.out.println("Хорошего дня!");
//                break;
//            }
//            switch (choice) {
//                case "1":
//                    System.out.println("Какой товар хотите положить?");
//                    list.addProduct(scan.nextLine());
//                    System.out.println("Вы положили товар в корзину");
//                    break;
//                case "2":
//                    list.showProducts();
//                    break;
//                case "3":
//                    System.out.println("Какой продукт хотите вернуть обратно на полку?");
//                    list.removeProduct(scan.nextLine());
//                    System.out.println("Вы успешно убрали товар");
//                    break;
//                case "4":
//                    list.clearProducts();
//                    System.out.println("Вы очистили всю корзину");
//                    break;
//                case "5":
//                    list.sortProducts();
//                    System.out.println("Вы отсортировали корзину");
//                    break;
//                default:
//                    System.out.println("Ошибка. Такой команды нет.");
//                    break;
//            }
//        }
//    }
//}
