package biblioteka;

import java.util.ArrayList;

public class library {
    private ArrayList<book> books = new ArrayList<>();

    public library() {
        book num1 = new book();
        num1.setTitle("Евгений онегин");
        num1.setPages(311);
        num1.setAuthor("Пушкин");
        num1.setAvailable(true);

        book num2 = new book();
        num2.setTitle("Трансерфинг реальности");
        num2.setPages(986);
        num2.setAuthor("Зеланд");
        num2.setAvailable(true);

        books.add(num1);
        books.add(num2);
    }

    public book findBook(String title) {
        for (book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
            }
        System.out.println("книга не найдена");
        return null;
    }

    public void printAll() {
        System.out.println("\nКниги в наличии: ");
        for (book b : books) {
            b.printInfo();
        }
    }
}
