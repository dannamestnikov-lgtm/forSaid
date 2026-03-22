package day06.model;

public class User {
    private final int id;
    private String name;
    private String email;
    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void printInfo(){
        System.out.println("ID пользователя: " + id + "\nИмя пользователя: " + name + "\nАдрес почты: " + email);
    }
    public String toString(){
        return id + " " + name + " " + email;
    }
}
