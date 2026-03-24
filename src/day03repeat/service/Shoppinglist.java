package day03repeat.service;

import java.util.ArrayList;
import java.util.Collections;

public class Shoppinglist {
    private ArrayList<String> products = new ArrayList<>();

   public void addProduct(String name){
       products.add(name);
   }
   public void Showroducts() {
       if (products.size() == 0) {
           System.out.println("Пустой список, брат. походу ты все проебал");
       } else {
           System.out.println("Все продукты из вашей корзины: ");
           for (int i = 0; i < products.size(); i++) {
               System.out.println(products.get(i));
           }
       }
   }
   public void removeProduct(String name) {
        if (products.contains(name)) {
        products.remove(name);
   }
       System.out.println("Вы успешно выкинули нахуй продукт на прилавок, а лучше бы спиздили");
}
public void clearProducts(){
       products.clear();
    System.out.println("вы проебали корзину");
}
public void sortProducts(){
    Collections.sort(products);
    System.out.println("вы отсортировали всё к хуям");
}

}
