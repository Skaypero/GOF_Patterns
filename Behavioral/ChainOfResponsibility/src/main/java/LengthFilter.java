public class LengthFilter extends MessageHandler {
    @Override
    public void handle(String message) {
        if (message.length() > 100 || handler == null) {
            System.out.println("Message is blocked");
        } else {
            handler.handle(message);
        }
    }
}
