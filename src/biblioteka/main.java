package biblioteka;

public class main {
    public static void main(String[] args) {
        library lb = new library();
        book num1 = lb.findBook("Трансерфинг реальности");
            num1.borrow();
            num1.giveBack();

        }
        }




