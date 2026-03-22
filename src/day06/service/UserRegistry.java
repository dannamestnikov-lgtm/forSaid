package day06.service;

import day06.model.User;
import day06.util.IdGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRegistry {
    private ArrayList <User> users = new ArrayList<>();
    public User register(String name){
        String email = name + "@mail.com";
        int id = IdGenerator.generateId();
        User usr = new User(id, name, email);
        users.add(usr);
        return usr;
    }
    public User register(String name, String email){
        int id = IdGenerator.generateId();
        User usr2 = new User(id, name, email);
        users.add(usr2);
        return usr2;
    }
    public void showUsers(){
        System.out.println("все пользователи: ");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
    public void findById(int id){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.get(i).printInfo();
                return;
            }
        }
                System.out.println("пользователя с таким id не существует");
            }
            public boolean isemailtaken(String email){
                for (int i = 0; i < users.size(); i++) {
                  if (users.get(i).getEmail().equals(email)) {
                      System.out.println("да, такая почта уже есть");
                      return true;
                  }
                }
                System.out.println("такая почта свободна");
                return false;
            }
        }

