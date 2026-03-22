package sms;

public class notifications {
    protected String text;
    public void send (String message){
            if (message.length() <= 100){
                this.text = message;
                System.out.println("отправлено");
            } else {
                System.out.println("слишком длинное сообщение");
            }

        }
    }

