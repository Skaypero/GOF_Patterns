package creator;

import notification.Notification;
import notification.PushNotification;

public class PushCreator implements NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
