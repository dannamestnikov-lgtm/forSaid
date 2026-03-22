package sms;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        notifications n1 = new notifications();

       ArrayList<notifications> arr = new ArrayList<>();
       arr.add(new smsNotification());
       arr.add(new emailNotification());

       for (notifications n : arr){
           n.send("анох бля кир стриг");
       }
        }
    }
