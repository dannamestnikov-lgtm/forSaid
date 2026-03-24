package polimorfizm;

public class main {
    public static void main(String[] args) {

        birds ostr2 = new ostrich();
        birds crow = new crow();

        test t1 = new test();
        t1.foo(crow);
    }
}
