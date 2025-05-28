import creator.PushCreator;
import creator.SmsCreator;
import creator.NotificationCreator;

public class Main {
    public static void main(String[] args) {
        NotificationCreator pushCreator = new PushCreator();
        NotificationCreator smsCreator = new SmsCreator();
        pushCreator.createNotification().send();
        smsCreator.createNotification().send();
    }
}
