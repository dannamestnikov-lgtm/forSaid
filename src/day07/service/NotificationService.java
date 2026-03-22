package day07.service;

import day07.model.Notification;

public interface NotificationService {
    Notification send(String reсipient, String text);
    String getChannelName();
}
