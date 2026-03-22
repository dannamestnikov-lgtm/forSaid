package proger;

public final class Person {
    private static int count;
    public Person(){
        count++;
    }
    public static void getCount(){
        System.out.println("количество: " + count);
    }
}
