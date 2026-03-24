package day07.service;

import day07.model.Notification;
import day07.util.NotificationIdGenerator;

public class SmsNotificationService implements NotificationService {
    @Override
    public Notification send(String reсipient, String text) {
        boolean sent = true;
        if (reсipient == null || reсipient.isBlank()) {
            sent = false;
        }
        if (text == null || text.isBlank()){
            sent = false;
        }
        if (text.length() > 30) {
            sent = false;
        }
        int id = NotificationIdGenerator.generateId();
        Notification n1 = new Notification(id, reсipient, text, "SMS", true);
        return n1;
    }

    @Override
    public String getChannelName() {
        return "SMS";
    }
}
