package sms;

public class emailNotification extends notifications {

        @Override
        public void send(String message) {
            if (message.length() <= 100) {
                this.text = message;
                System.out.println("EMAIL отправлено: " + message);
            } else {
                System.out.println("слишком длинное сообщение");
            }
        }
    }

