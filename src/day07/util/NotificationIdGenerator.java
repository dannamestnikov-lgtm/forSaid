package day07.util;

public class NotificationIdGenerator {
    private static int nextId = 1;
    public static int generateId(){
        int id = nextId;
        nextId ++;
        return id;
    }
}
