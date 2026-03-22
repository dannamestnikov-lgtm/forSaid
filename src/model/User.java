package model;

public class User {
    private final int id;
    private String name;
    public String getName(){
        return name;
    }
    private String email;
    public String getEmail() {
        return email;
    }
    public int getId(){
        return id;
    }
    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
