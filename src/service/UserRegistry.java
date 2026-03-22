package service;

import model.User;
import util.IdGenerator;

import java.util.ArrayList;

public class UserRegistry {
    private ArrayList <User> users = new ArrayList<>();
    public User register(String name, String email){
        int id = IdGenerator.generateId();
        User user1;
        user1 = new User (id, name, email);
        users.add(user1);
        return user1;
    }
    public User register(String name){
        String email = name + "@mail.com";
        return register(name, email);
    }
}
