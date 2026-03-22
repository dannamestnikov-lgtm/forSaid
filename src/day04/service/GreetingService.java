package day04.service;

public class GreetingService {

    public void greet() {
        System.out.println("привет!");
    }

    public void greet(String name) {
        if (name.isEmpty()){
            System.out.println("ошибка");
            return;
        }
        System.out.println("привет " + name);
    }

    public void greet(String name, int times) {
        if (times < 1){
            System.out.println("операция не может быть выполнена меньше одного раза в этом методе");
            return;
        }
        for (int i = 0; i < times; i++) {
            System.out.println("привет! " + name);
        }
    }

    public void greet(String name, String status){
        System.out.println("привет, " + name + "\nтвой статус: " + status);
    }
}
