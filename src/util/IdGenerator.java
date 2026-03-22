package util;

public class IdGenerator {
    private static int nextId = 1;
    public static int generateId(){
        int currentId = nextId;
        nextId ++;
        return currentId;
    }
}
