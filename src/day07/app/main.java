package day07.app;

import day07.service.NotificationManager;

public class main {
   public static void main(String[] args) {
       NotificationManager manager = new NotificationManager();
       manager.sendEmail("Бате", "ЗДАРОВА БАТЯ. короче, пишу тебе по почте ибо инет обрубили. пиво в холодильнике осталось? пидорас");
       manager.sendSMS("собаке", "я знаю что ты нихуя не умеешь читать. я просто проверяю работают ли смс");
    }
}
