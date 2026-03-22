package day07.model;

public class Notification {
    private final int id;
    private String recipient;
    private String text;
    private String channel;
    private boolean sent;
    public Notification(int id, String recipient, String text, String channel, boolean sent){
        this.id = id;
        this.recipient = recipient;
        this.text = text;
        this.channel = channel;
        this.sent = sent;
    }
    public int getId(){
        return  id;
    }
    public String getText(){
        return text;
    }
    public String getRecipient(){
        return recipient;
    }
    public String getChannel(){
        return channel;
    }
    public boolean isSent(){
        return sent;
    }
    public String toString(){
        return id + " " + text + " " + recipient + " " + channel + " " + sent + " ";
    }
}
