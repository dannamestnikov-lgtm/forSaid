package day07.service;

import day07.model.Notification;
import day07.util.NotificationIdGenerator;

public class EmailNotificationService implements NotificationService {
    @Override
    public Notification send(String recipient, String text) {
        int id = NotificationIdGenerator.generateId();
        Notification n1 = new Notification(id, recipient, text, "EMAIL", true);
        return n1;
    }
    @Override
    public String getChannelName() {
        return "EMAIL";
    }
}
