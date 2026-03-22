//package day03.service;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class ShoppingList {
//   private ArrayList<String> products = new ArrayList<>();
//
//    public void addProduct(String name) {
//        products.add(name);
//    }
//
//    public void showProducts() {
//        if (products.size() == 0) {
//            System.out.println("Список товаров пуст");
//        } else {
//            System.out.println("Список товаров: ");
//            for (int i = 0; i < products.size(); i++) {
//                System.out.println(products.get(i));
//            }
//        }
//    }
//    public void removeProduct(String name){
//if (products.contains(name)){
//    products.remove(name);
//} else {
//    System.out.println("Такой товар не найден");
//}
//    }
//    public void clearProducts(){
//        products.clear();
//    }
//    public void sortProducts(){
//        Collections.sort(products);
//    }
//}


