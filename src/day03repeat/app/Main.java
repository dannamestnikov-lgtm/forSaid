package day03repeat.app;

import day03repeat.service.Shoppinglist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shoppinglist list = new Shoppinglist();

        while (true) {
                System.out.println("\nЧе сделать хотите? \n1 - продукт в корзину закинуть \n2 - глянуть че там набрал \n3 - скинуть лишний груз \n4 - проебать корзину \n5 - сортировочку дать \n0 - выйти нахуй");
            String choice = scan.nextLine();
            if (choice.equals(0)) {
                System.out.println("бля давай братишка до скорого");
                break;
            }
                switch (choice) {
                    case "1":
                        System.out.println("Что хотите положить в корзину?");
                        list.addProduct(scan.nextLine());
                        System.out.println("Вы не промахнулись, когда бросали товар в тележку");
                        break;
                    case "2":
                        list.Showroducts();
                        break;
                    case "3":
                        System.out.println("какой продукт желаете нахуй выкинуть?");
                        list.removeProduct(scan.nextLine());
                        break;
                    case "4":
                        list.clearProducts();
                    case "5":
                        list.sortProducts();
                    default:
                        System.out.println("братец, ошибся да ты");
                        break;
                }
            }
        }
    }
