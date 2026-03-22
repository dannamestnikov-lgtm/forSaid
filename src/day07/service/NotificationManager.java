package day07.service;

import day07.model.Notification;

import java.util.ArrayList;

public class NotificationManager {
   private ArrayList<Notification> notifications = new ArrayList<>();
   private NotificationService emailService = new EmailNotificationService();
   private NotificationService smsService = new SmsNotificationService();
   public Notification sendEmail (String recipient, String text){
       Notification nE = emailService.send(recipient, text);
       notifications.add(nE);
       return nE;
    }
    public Notification sendSMS (String recipient, String text){
       Notification nS = smsService.send(recipient, text);
       notifications.add(nS);
       return nS;
    }
    public void showAllNotifications(){
        System.out.println("Все уведомления: ");
        if (notifications.isEmpty()){
            System.out.println("Список пуст");
            return;
        }
        for (int i = 0; i < notifications.size(); i++) {
            System.out.println(notifications.get(i));
        }
    }
    public Notification findById(int id){
        for (int i = 0; i < notifications.size(); i++) {
            if (notifications.get(i).getId() == id){
                return notifications.get(i);
            }
            }
        return null;
        }
        public void onlySent(){
       boolean found = false;
            System.out.println("Все успешно отправленные сообщения:");
            for (int i = 0; i < notifications.size(); i++) {
                if (notifications.get(i).isSent()){
                    System.out.println(notifications.get(i));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("список пуст");
            }

    }
    public void onlyFailed(){
        System.out.println("Все неотправленные сообщения: ");
        for (int i = 0; i < notifications.size(); i++) {
            if (!notifications.get(i).isSent()){
                System.out.println(notifications.get(i));
            }
        }
        System.out.println("Таких нет");
        return;
    }
}
