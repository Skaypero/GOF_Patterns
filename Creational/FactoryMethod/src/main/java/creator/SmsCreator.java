package creator;

import notification.Notification;
import notification.SmsNotification;

public class SmsCreator implements NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
