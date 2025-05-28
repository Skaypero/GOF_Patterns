package creator;

import notification.EmailNotification;
import notification.Notification;

public class EmailCreator implements NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
